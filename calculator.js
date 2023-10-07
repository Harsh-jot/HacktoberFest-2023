function calculateCGPA() {
    const gradesInput = document.getElementById('grades').value;

    // Split the input by comma and convert to an array of numbers
    const gradesArray = gradesInput.split(',').map(parseFloat);

    // Calculate the total sum of grades
    const totalGradePoints = gradesArray.reduce((acc, grade) => acc + grade, 0);

    // Calculate the CGPA (assuming a 10-point scale)
    const cgpa = totalGradePoints / gradesArray.length;

    // Display the result
    const resultElement = document.getElementById('result');
    resultElement.textContent = `Your CGPA is: ${cgpa.toFixed(2)} (on a 10-point scale)`;
}
