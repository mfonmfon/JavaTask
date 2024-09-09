//input = [2,3,1,4,2,1]
//output = [6,7]

let numbers  = []
function numbersArray(array){
  let sum = 0;
  for(let index = 0; index < array.length; index++){
  sum = numbers.push(array[index + 1] + array[index + 1]);
  }
  return sum 
}
console.log(numbersArray([2,3,1,4,2,1]))