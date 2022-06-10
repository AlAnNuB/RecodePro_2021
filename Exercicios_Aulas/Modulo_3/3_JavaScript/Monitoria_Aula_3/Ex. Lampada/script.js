const img = document.getElementById("img")
let count = 0
let quebrada = false
img.addEventListener("click", function() {
    if (quebrada == false) {
        count += 1
        img.src = "MicrosoftTeams-image (4).png"
    }
    if (count % 2 == 0 && quebrada == false) {
        img.src = "MicrosoftTeams-image (3).png"
    }
})

img.addEventListener("dblclick", () => {
    img.src = "MicrosoftTeams-image (5).png"
    quebrada = true
})

const outraL = document.getElementById("outra")

outraL.addEventListener("click", () => {
    quebrada = false
    img.src = "MicrosoftTeams-image (3).png"
})
