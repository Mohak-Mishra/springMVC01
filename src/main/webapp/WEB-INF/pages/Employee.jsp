<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<form action="/employee/save" method="post">
    <table>
        <tr>
            <th>
                Employee Id
            </th>
            <td>
                <input type="text" name="empId">
            </td>
        </tr>
        <tr>
            <th>
                Employee Name
            </th>
            <td>
                <input type="text" name="empName">
            </td>
        </tr>
        <tr>
            <th>
                Employee Salary
            </th>
            <td>
                <input type="text" name="empSalary">
            </td>
        </tr>
        <tr>
            <th>
                Employee Password
            </th>
            <td>
                <input type="password" name="empPwd">
            </td>
        </tr>
        <tr>
            <th>
                Employee Department
            </th>
            <td>
                <input type="text" name="empDept">
            </td>
        </tr>
        <tr>
            <th>
                Employee Address
            </th>
            <td>
                <input type="text" name="empAddr">
            </td>
        </tr>
        <tr>
            <th></th>
            <td> <input type="submit" value="submit"></td>

        </tr>
    </table>
</form>
</body>
</html>