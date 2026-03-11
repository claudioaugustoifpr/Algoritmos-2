# Algoritmos-2

Prova Simulada Algoritmos 2
#

1)
O produto escalar entre dois vetores A e B de mesmo tamanho n é definido como:
A[0]⋅B[0]+A[1]⋅B[1]+⋯+A[n−1]⋅B[n−1]
Escreva um método recursivo em Java que receba dois vetores de inteiros a[] e b[], além do tamanho n, e retorne o produto escalar entre eles.
Seu programa deve conter:
um método recursivo
uma condição de parada
um método main que leia os dados, chame a função e imprima o resultado.
2)
Faça um programa em Java que leia dois números inteiros A e B (com A <= B) e calcule a soma de todos os números pares existentes no intervalo [A, B].
Se não houver nenhum número par, a soma deve ser 0.


O programa deve imprimir no formato:

A soma dos pares entre A e B é X

3)
Implemente o método public static int somaMultiplos3ou5(int n) que retorna a soma de todos os números naturais menores que n que são múltiplos de *3* ou *5*.
Exemplo:
- Para n = 10, os múltiplos de 3 ou 5 abaixo de 10 são: 3, 5, 6, 9 → soma = 23
- Para n = 20 → múltiplos: 3, 5, 6, 9, 10, 12, 15, 18 → soma = 78

4)
Escreva um programa em Java que leia uma palavra e conte quantas consoantes existem nela.
Considere como vogais as letras:
a, e, i, o, u
Todas as demais letras devem ser consideradas consoantes.
Entrada
programacao
Saída
6

5)
Implemente um método chamado bubbleSort que receba um vetor de inteiros e o ordene em ordem crescente utilizando o algoritmo Bubble Sort.
O método deve modificar o próprio vetor e não retornar um novo.
Não use métodos prontos de ordenação como Arrays.sort().


6)Um número inteiro positivo é chamado de perfeito se a soma de seus divisores próprios (excluindo ele mesmo) é igual ao próprio número.
Exemplos:
6 é perfeito → divisores: 1, 2, 3 → soma = 6.
28 é perfeito → divisores: 1, 2, 4, 7, 14 → soma = 28.


Tarefa
Escreva um programa em Java que leia um número inteiro positivo N e determine se ele é um número perfeito.
Se for, imprima:

N é perfeito

Caso contrário, imprima:

N não é perfeito


7)
Escreva um método em Java que receba uma frase e retorne a quantidade de palavras contidas nela.
Considere que as palavras estão separadas por espaços.
Entrada:
Olá mundo da programação
Saída:
4
