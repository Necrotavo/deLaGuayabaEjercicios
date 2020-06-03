/*******************************************Ejercicio 1 Multiplicar Otros*/
var array1 = [2, 3, 4, 6];
var array2 = [123, 67, 890, 4];
var array3 = [2, 3, 7, 9, 4, 5, 6, 9, 12];
console.log("Primer ejericio, multiplicar otros numeros en una lista:")
function multiplyOthers(ar) {
  var productArray = [];
  for(i=0; i <ar.length; i++){
    var product = 1
    for(j=0; j<ar.length; j++ ){
      if(j!=i){
        product*=ar[j];
      }
    }
  productArray.push(product);
  }
  console.log(productArray)
}

multiplyOthers(array1);
multiplyOthers(array2);
multiplyOthers(array3);

/*******************************************Ejercicio 2 Factorial*/
console.log("Segundo ejericio, calcular factorial:")
function factorial(number){
  var producto = 1;
  
  if(number == 0){
    return producto;
  }
  if(number > 0){
    var count = 0;
    while(count < number){
      count++
      producto*=count;
    }
      return producto;
  }

}
var askNumber = prompt("Por favor, ingrese un numero entero positivo\n ");
console.log(factorial(askNumber));
