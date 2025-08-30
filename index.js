const express = require('express')
const cors = require('cors')
const bodyParser = require('body-parser')
const {
    sql,
    pool,
    poolConnect
} = require('./db')

const app = express()
app.use(cors())
app.use(bodyParser.json())

// API REGISTER
app.post('/api/register', async (req, res) => {
  const { username, email, pass } = req.body
  const id = 'U' + Date.now()
  const datebirth = '01/01/2000'
  const phone = '0000000000'
  const address = 'No Address'

  await poolConnect
  try {
    const check = await pool.request()
      .input('email', sql.NVarChar(100), email)
      .query('SELECT Idu FROM USERS WHERE Email = @email')

    if (check.recordset.length > 0) {
      return res.status(400).json({ message: 'Email has been used!' })
    }

    await pool.request()
      .input('id', sql.VarChar(50), id)
      .input('username', sql.NVarChar(100), username)
      .input('email', sql.NVarChar(100), email)
      .input('pass', sql.VarChar(50), pass)
      .input('dob', sql.NVarChar(20), datebirth)
      .input('phone', sql.VarChar(10), phone)
      .input('address', sql.NVarChar(255), address)
      .query(`
        INSERT INTO USERS (Idu, Username, Datebirth, Email, Pass, Phone, Addressuser)
        VALUES (@id, @username, @dob, @email, @pass, @phone, @address)
      `)

    res.sendStatus(200)
  } catch (err) {
    console.error(err)
    res.status(500).json({ message: 'Internal server error' })
  }
})

/* app.post('/api/register', async (req, res) => {
    const {
        username,
        email,
        pass
    } = req.body
    const id = 'U' + Date.now()
    const datebirth = '01/01/2000'
    const phone = '0000000000'
    const address = 'No Address'

    await poolConnect
    try {
        await pool.request()
            .input('id', sql.VarChar(50), id)
            .input('username', sql.NVarChar(100), username)
            .input('email', sql.NVarChar(100), email)
            .input('pass', sql.VarChar(50), pass)
            .input('dob', sql.NVarChar(20), datebirth)
            .input('phone', sql.VarChar(10), phone)
            .input('address', sql.NVarChar(255), address)
            .query(`
        INSERT INTO USERS (Idu, Username, Datebirth, Email, Pass, Phone, Addressuser)
        VALUES (@id, @username, @dob, @email, @pass, @phone, @address)
      `)
        res.sendStatus(200)
    } catch (err) {
        console.error(err)
        res.status(400).json({
            message: 'Email has been used!'
        })
    }
})*/

// API LOGIN
app.post('/api/login', async (req, res) => {
    const {
        email,
        pass
    } = req.body

    await poolConnect
    const result = await pool.request()
        .input('email', sql.NVarChar(100), email)
        .input('pass', sql.VarChar(50), pass)
        .query(`SELECT * FROM USERS WHERE Email = @email AND Pass = @pass`)

    if (result.recordset.length === 0) {
        return res.status(401).json({
            message: 'Wrong username or password'
        })
    }

    const user = result.recordset[0]
    res.json({
        id: user.Idu,
        name: user.Username
    })
})

// API: Get user info by ID
app.get('/api/user/:id', async (req, res) => {
    const userId = req.params.id

    await poolConnect
    try {
        const result = await pool.request()
            .input('id', sql.VarChar(50), userId)
            .query(`SELECT Idu, Username, Datebirth, Email, Phone, Addressuser FROM USERS WHERE Idu = @id`)

        if (result.recordset.length === 0) {
            return res.status(404).json({
                message: 'User not found'
            })
        }

        res.json(result.recordset[0])
    } catch (err) {
        console.error('Error fetching user by ID:', err)
        res.status(500).json({
            message: 'Internal server error'
        })
    }
})

// NEW API: Get all products
app.get('/api/products', async (req, res) => {
    await poolConnect
    try {
        const result = await pool.request().query(`SELECT * FROM PRODUCTS`);
        res.json(result.recordset);
    } catch (err) {
        console.error('Error fetching products:', err);
        res.status(500).json({
            message: 'Internal server error'
        });
    }
});

// LOAD SERVER
app.listen(3000, () => {
    console.log('🚀 Server is running at http://localhost:3000')
})