function validateForm() {
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const dob = document.getElementById("dob").value;
  const country = document.getElementById("country").value;
  const gender = document.querySelectorAll('input[name="gender"]:checked');
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;


  if (firstName === "" || lastName === "" || dob === "" || country === "" ||gender==="" || profession === "" || email === "" || mobile === "") {
    alert("Please fill in all the fields.");
    return false;
  }

  return true;

  
}

document.getElementById("submitBtn").addEventListener("click", function() {
  if (validateForm()) {
    showPopup();
  }
});

document.getElementById("resetBtn").addEventListener("click", function() {
  document.getElementById("surveyForm").reset();
});

document.querySelector(".popup-close").addEventListener("click", function() {
  closePopup();
  document.getElementById("surveyForm").reset();
});

function showPopup() {
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const dob = document.getElementById("dob").value;
  const country = document.getElementById("country").value;
  const gender = document.querySelectorAll("input[type='checkbox']:checked");
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  document.getElementById("popup-firstName").textContent = firstName;
  document.getElementById("popup-lastName").textContent = lastName;
  document.getElementById("popup-dob").textContent = dob;
  document.getElementById("popup-country").textContent = country;
  document.getElementById("popup-gender").textContent = Array.from(gender).map(g => g.value);
  document.getElementById("popup-profession").textContent = profession;
  document.getElementById("popup-email").textContent = email;
  document.getElementById("popup-mobile").textContent = mobile;

  document.getElementById("popup").style.display = "block";
}

function closePopup() {
  document.getElementById("popup").style.display = "none";
}

