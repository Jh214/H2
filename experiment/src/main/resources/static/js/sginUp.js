document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('signupForm');
    const passwordInput = document.getElementById('password');
    const confirmPasswordInput = document.getElementById('confirmPassword');

    form.addEventListener('submit', function (event) {
        if (passwordInput.value !== confirmPasswordInput.value) {
            alert("Passwords do not match!");
            event.preventDefault();
        }
    });
});
