const nums = [12, -1, 15, -22, 33, -87, -91, 25, 52, 12, 94];
let max = nums[0];
let second_max = nums[0];

for(let i = 0; i < nums.length; i++){
  if(max<nums[i]){
    max = nums[i];
  }
}  
for(let i = 0; i < nums.length; i++){
  if(second_max<nums[i] && nums[i]!=max){
      second_max = nums[i];
  }
}

console.log("The maximun number is: " + max);
console.log("The second maximun number is: " + second_max);
