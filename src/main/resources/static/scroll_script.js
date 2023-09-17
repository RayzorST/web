
var prevScrollpos = window.pageYOffset;
window.onscroll = function() {
    var currentScrollPos = window.pageYOffset;
    var navElements = document.getElementsByClassName("nav");
    for (var i = 0; i < navElements.length; i++) {
        if (prevScrollpos > currentScrollPos) {navElements[i].style.top = "0";}
        else {
            navElements[i].style.top = "-100px";
        }
    }
    prevScrollpos = currentScrollPos;
}

