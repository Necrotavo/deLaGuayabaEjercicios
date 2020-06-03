#Ejercicio 3 
#-Se hacen prints por cuestión de orden a pesar de que el ejercicio no lo solicitaba
print("Ejercicio 3 - Mostrar el elemento mas grande\n\n")
myArray = Array.new(5) {rand(1...100)}
print(myArray);
print("\nEl elemento mas grande corresponde al: ")
print(myArray.max);
print("\n\n")
#Ejercicio 4
#-Se hacen prints por cuestión de orden a pesar de que el ejercicio no lo solicitaba
print("Ejercicio 4 - Mostrar histograma\n\n")
myArray = Array.new(10) {rand(1...5)}
print(myArray);
auxArray = [1,2,3,4,5];
auxArray.each do |n|
  print("\n")
  print(n);
  print(": ")
    myArray.each do |m|
      if n==m
        print("*")
      end
    end
  end