const nums = [-48, 2, -86, -15, -18, -47, -74, 93, 8, -28];

nums.sort(function descending(a,b){
  if(a<b){
    return 1; //para que 'a' que es menor se ponga despues
  } 
  if(a>b){
    return -1; //para que 'b' que es menor se mantenga despues de 'a'
  }else{
    return 0; // para que se mantengan en las mismas posiciones
  }
});

console.log(nums);
