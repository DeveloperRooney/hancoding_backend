
document.cookie = 'same-site-cookie=foo; SameSite=Lax';
document.cookie = 'cross-site-cookie=bar; SameSite=None; Secure';


// SideNav 제어


function openSideNav() {

    // document.querySelector(".ham-btn").style.display = "none";
    document.querySelector(".ham-btn").style.opacity = "0";



    document.querySelector(".sidenav").style.opacity = "1";
    document.querySelector(".sidenav").style.width = "120px";
    document.querySelector(".sidenav").style.zIndex = "1";
    document.querySelector(".toastui-editor-defaultUI").style.zIndex = "-3";

}

function closeSideNav() {
    
    // document.querySelector(".ham-btn").style.display = "block";
    document.querySelector(".ham-btn").style.opacity = "1";
    
    
    
    document.querySelector(".sidenav").style.opacity = "0";
    document.querySelector(".sidenav").style.width = "0";
    document.querySelector(".sidenav").style.zIndex = "-1";
    document.querySelector(".toastui-editor-defaultUI").style.zIndex = "1";

}


window.addEventListener('resize', function() {
    if (this.window.innerWidth > 680) {
        document.querySelector(".ham-btn").style.opacity = "0";
        document.querySelector(".ham-btn").style.display = "none";

        document.querySelector(".sidenav").style.opacity = "0";
        document.querySelector(".sidenav").style.width = "0";
        document.querySelector(".sidenav").style.zIndex = "-1";
        document.querySelector(".toastui-editor-defaultUI").style.zIndex = "1";


    }

    if((this.window.innerWidth <= 680) &&
        (document.querySelector(".sidenav").style.opacity == "0")) {
        document.querySelector(".ham-btn").style.opacity = "1";
        document.querySelector(".ham-btn").style.display = "block";

    }

}, true);