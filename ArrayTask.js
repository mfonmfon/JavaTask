//input [2,3,4,5]
//output[2,3,4,5,6]


//input[9,9,9,9]
//output[1,0,0,0,0]
let arrayValue = [1,2,3,4,7,9,8,6,5,4,3,2,1]

function addOne(arr) {
    let carry = 1;
    for (let index = arr.length - 1; index >= 0; index--) {
        let sum = arr[index] + carry;
        arr[index] = sum % 10;
        carry = Math.floor(sum / 10);
    }
    if (carry > 0) {
        arr.unshift(carry);
    }
    return arr;
}
let result = addOne(arrayValue);
console.log(result);