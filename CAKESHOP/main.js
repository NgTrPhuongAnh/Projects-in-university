/*=============== SHOW MENU ===============*/
const navMenu = document.getElementById('nav-menu'),
navToggle = document.getElementById('nav-toggle'),
navClose = document.getElementById('nav-close')

/*=============== MENU SHOW ===============*/
if(navToggle) {
    navToggle.addEventListener('click', () => {
        navMenu.classList.add('show-menu')
    })
}

/*=============== MENU HIDDEN ===============*/
if(navClose) {
    navClose.addEventListener('click', () => {
        navMenu.classList.remove('show-menu')

    })
}

/*=============== REMOVE MENU MOBILE ===============*/
const navLink = document.querySelectorAll('.nav_link')

const linkAction = () => {
    const navMenu = document.getElementById('nav-menu')
    navMenu.classList.remove('show-menu')
}

/*=============== CHANGE BACKGROUND HEADER ===============*/
const scrollHeader = () => {
    const header = document.getElementById('header')
    this.scrollY >= 50 ? header.classList.add('bg-header')
    : header.classList.remove('bg-header')
}
window.addEventListener('scroll', scrollHeader)

/*=============== SHOW SCROLL UP ===============*/
const scrollUp = () => {
  const scrollUpEl = document.getElementById('scrollup');
  if (!scrollUpEl) {
    console.warn('⚠️ Cannot find id="scrollup"');
    return;
  }

  if (window.scrollY >= 350) {
    scrollUpEl.classList.add('show-scroll');  // class đúng để hiển thị
  } else {
    scrollUpEl.classList.remove('show-scroll');
  }
};

document.addEventListener('DOMContentLoaded', () => {
  window.addEventListener('scroll', scrollUp);
});


/*=============== SCROLL SECTIONS ACTIVE LINK ===============*/
const sections = document.querySelectorAll('section[id]')

const scrollAction = () => {
    const scrollY =window.pageYOffset
    
    sections.forEach(current => {
        const sectionHeight = current.offsetHeight,
            sectionTop = current.offsetTop - 58,
            sectionId = current.getAttribute('id'),
            sectionsClass = document.querySelector('.nav_menu a[href*=' + sectionId + ']')

        if(scrollY > sectionTop && scrollY <= sectionTop + sectionHeight) {
            sectionsClass.classList.add('active-link')
        }
        else {
            sectionsClass.classList.remove('action-link')
        }
    })
}
window.addEventListener('scroll', scrollAction)

/*=============== DARK LIGHT THEME ===============*/
const themeButton = document.getElementById('theme-button')
const darkTheme = 'dark-theme'
const iconTheme = 'ri-sun-line'

// PREVIOUSLY SECLECTED TOPIC
const selectedTheme = localStorage.getItem('selected-theme')
const selectedIcon = localStorage.getItem('selected-icon')

const getCurrentTheme = () => document.body.classList.contains (darkTheme) ? 'dark' : 'light'
const getCurrentIcon = () => themeButton.classList.contains (iconTheme) ? 'ri-moon-line' : 'ri-sun-light'

if (selectedTheme) {
    document.body.classList[selectedTheme === 'dark' ? 'add' : 'remove'] (darkTheme)
    themeButton.classList[selectedIcon === 'ri-moon-line' ? 'add' : 'remove'] (iconTheme)
}

themeButton.addEventListener('click', () => {
    document.body.classList.toggle(darkTheme)
    themeButton.classList.toggle(iconTheme)

    localStorage.setItem('selected-theme', getCurrentTheme())
    localStorage.setItem('selected-icon', getCurrentIcon())
})

/*=============== SCROLL REVEAL ANIMATION ===============*/
const sr = ScrollReveal({
    origin: 'top',
    distance: '60px',
    duration: 2500,
    delay: 400,
})

sr.reveal('.home_img, .newsletter_container, .footer_logo, .footer_description, .footer_content, .footer_info')
sr.reveal('.home_data', {origin: 'bottom'})
sr.reveal('.about_data, .recently_data', {origin: 'left'})
sr.reveal('.about_img, .recently_img', {origin: 'right'})
sr.reveal('.popular_card', {interval: 100})

/* SHOW LOGIN MODAL ON 'ORDER NOW' CLICK */
document.addEventListener('DOMContentLoaded', () => {
  const modal = document.getElementById('auth-modal')
  const closeBtn = document.getElementById('auth-close')
  const orderButtons = document.querySelectorAll('.order-now')

  if (modal && closeBtn && orderButtons.length > 0) {
    orderButtons.forEach(btn => {
      btn.addEventListener('click', (e) => {
        e.preventDefault()
        modal.style.display = 'flex'
        showLogin()  
      })
    })

    closeBtn.addEventListener('click', () => {
      modal.style.display = 'none'
    })

    window.addEventListener('click', (e) => {
      if (e.target === modal) {
        modal.style.display = 'none'
      }
    })
  } else {
    console.warn("❌ Cannot find modal or closebutton or orderbutton.")
  }
})

function showLogin() {
  document.getElementById("login-form").classList.add("active")
  document.getElementById("register-form").classList.remove("active")
}

function showRegister() {
  document.getElementById("login-form").classList.remove("active")
  document.getElementById("register-form").classList.add("active")
}

function moveToLogin() {
  //document.getElementById("form-container").style.transform = "translateX(0%)"
  showLogin()
}

function moveToRegister() {
  //document.getElementById("form-container").style.transform = "translateX(0%)"
  showRegister()
}

//============== REGISTER ==============
document.getElementById('register-form').addEventListener('submit', async (e) => {
  e.preventDefault()
  const username = document.getElementById('reg-name').value
  const email = document.getElementById('reg-email').value
  const pass = document.getElementById('reg-password').value

  const res = await fetch('http://localhost:3000/api/register', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ username, email, pass })
  })

  if (res.ok) {
    alert('Successful registration!')
    moveToLogin()
  } else {
    const data = await res.json()
    alert('Email has been used!')
  }
})

//============== LOGIN ==============
document.getElementById('login-form').addEventListener('submit', async (e) => {
  e.preventDefault()
  const email = document.getElementById('login-email').value
  const pass = document.getElementById('login-password').value

  const res = await fetch('http://localhost:3000/api/login', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ email, pass })
  })

  if (res.ok) {
  const data = await res.json()
  localStorage.setItem('userid', data.id)
  localStorage.setItem('username', data.name)
  showGreeting(data.name)
  alert('Login successful! Welcome ' + data.name)  
  location.reload(); //
  document.getElementById('auth-modal').style.display = 'none'
  } else {
    alert('Wrong login information!')
  }
})

function showGreeting(name) {
  const greeting = document.getElementById('user-greeting')
  greeting.innerText = `👋 Have a nice day, ${name}`
  greeting.style.display = 'block'
}

window.addEventListener('DOMContentLoaded', () => {
  const name = localStorage.getItem('username')
  if (name) showGreeting(name)
})

//============== ICON USER ==============
document.addEventListener('DOMContentLoaded', () => {
  const userIcon = document.querySelector('.nav_user')

  userIcon.addEventListener('click', async () => {
    const userId = localStorage.getItem('userid')

    if (!userId) {
      const modal = document.getElementById('auth-modal')
      modal.style.display = 'flex'
      showLogin()
    } else {
      try {
        const res = await fetch(`http://localhost:3000/api/user/${userId}`)
        if (res.ok) {
          const user = await res.json()

          const infoBox = document.getElementById('user-info-content')
          infoBox.innerHTML = `
            <p><strong>ID:</strong> ${user.Idu}</p>
            <p><strong>Name:</strong> ${user.Username}</p>
            <p><strong>Email:</strong> ${user.Email}</p>
            <p><strong>Phone:</strong> ${user.Phone}</p>
            <p><strong>Address:</strong> ${user.Addressuser}</p>
            <p><strong>Date of Birth:</strong> ${user.Datebirth}</p>
          `

          document.getElementById('user-info-modal').style.display = 'flex'
        } else {
          alert("Cannot load user info.")
        }
      } catch (err) {
        console.error(err)
        alert("Error loading user information.")
      }
    }
  })
})

function closeUserInfo() {
  document.getElementById('user-info-modal').style.display = 'none';
}

function logout() {
  const confirmLogout = confirm("Bạn có chắc chắn muốn đăng xuất?");
  if (confirmLogout) {
    localStorage.removeItem('userid');
    localStorage.removeItem('username');
    alert('Bạn đã đăng xuất thành công!');
    location.reload();
  }
}

//============== ORDER NOW ==============
document.querySelectorAll('.order-now').forEach(btn => {
  btn.addEventListener('click', (e) => {
    e.preventDefault();
    const userId = localStorage.getItem('userid');

    if (!userId) {
      document.getElementById('auth-modal').style.display = 'flex';
      showLogin();
    } else {
      document.getElementById('auth-modal').style.display = 'none';
      document.getElementById('order-form-container').style.display = 'flex';
      loadProducts();
    }
  });
});

function closeOrderForm() {
  document.getElementById('order-form-container').style.display = 'none';
}

async function loadProducts() {
  try {
    const res = await fetch('http://localhost:3000/api/products');
    const products = await res.json();
    const list = document.getElementById('product-list');

    if (products.length === 0) {
      list.innerHTML = '<p>Không có sản phẩm nào.</p>';
      return;
    }

  list.innerHTML = products.map(p => {
    const imageUrl = `${window.location.origin}/CAKESHOP/${p.ImageUrl}`;
    return `
      <div class="product-card">
        <img src="${imageUrl}" alt="${p.Namepd}" />
        <h4>${p.Namepd}</h4>
        <p><strong>Giá:</strong> ${p.Price} đ</p>
        <p><strong>Phân loại:</strong> ${p.Category}</p>
      </div>
    `;
  }).join('');
  } catch (err) {
    console.error('Lỗi khi tải sản phẩm:', err);
    document.getElementById('product-list').innerHTML = '<p>Lỗi khi tải dữ liệu.</p>';
  }
}

document.addEventListener('DOMContentLoaded', loadProducts);

