Algoritmo CalculoIngresosFerreteria
	Definir Martillos,Puntillas,ingresosMensuales Como Real;
	Martillos <- 15000;
	Puntillas <- 200;
	Escribir 'Ingrese las ventas mensuales de Martillos';
	Leer ventasMartillos;
	Escribir 'Ingrese las ventas mensuales de puntillas';
	Leer ventasPuntillas;
	ingresosMensuales <- (Martillos*1500)+(Puntillas*200);
	Si ingresosMensuales>=1000000 Entonces
		ingresosMensuales <- ingresosMensuales+50000;
	FinSi
	ingresosMensuales <- ingresosMensuales+200000;
	Si ventasMartillos+ventasPuntillas<200000 Entonces
		Escribir 'No cumpliste con las ventas minimas por mes.';
	SiNo
		Escribir 'Los ingresosMensuales son $',ingresosMensuales;
	FinSi
FinAlgoritmo
