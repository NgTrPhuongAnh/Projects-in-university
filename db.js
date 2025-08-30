const sql = require('mssql')

const config = {
  user: 'sa', 
  password: '123456', 
  server: 'localhost',       
  database: 'CAKESHOP',      
  options: {
    trustServerCertificate: true
  }
}

const pool = new sql.ConnectionPool(config)
const poolConnect = pool.connect()

module.exports = { sql, pool, poolConnect }
