const nums = [51, -72, 62, 30, 40, -55, -52, -60, 72, -93];

nums.sort(function compareFunction(a, b) {
  if (a < b) {
    return -1; //'a' despues que 'b' en el array
  }
  if (a > b) {
    return 1; //'a' antes que 'b' en el array
  }
  // a igual a b, se quedan en la misma posicion en la que estaban
  return 0;
});

console.log(nums);
