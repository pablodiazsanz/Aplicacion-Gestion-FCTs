package Aplicacion;
import Vistas.configLogin;
import Vistas.crearCuenta;
import Vistas.datosTutEmp;
import Vistas.dirAlumnos;
import Vistas.dirAlumnosB;
import Vistas.dirAlumnosEd;
import Vistas.dirAlumnosEdA;
import Vistas.dirAlumnosEdE;
import Vistas.dirAlumnosEdM;
import Vistas.dirEmpresas;
import Vistas.dirEmpresasA;
import Vistas.dirEmpresasB;
import Vistas.dirEmpresasE;
import Vistas.dirEmpresasM;
import Vistas.dirGrupos;
import Vistas.dirGruposB;
import Vistas.dirInformes;
import Vistas.dirTutores;
import Vistas.dirTutoresA;
import Vistas.dirTutoresB;
import Vistas.dirTutoresE;
import Vistas.dirTutoresM;
import Vistas.director;
import Vistas.empAlumnos;
import Vistas.empAlumnosB;
import Vistas.empTutores;
import Vistas.empTutoresB;
import Vistas.empresa;
import Vistas.login;
import Vistas.tutAlumnos;
import Vistas.tutAlumnosB;
import Vistas.tutAlumnosEd;
import Vistas.tutAlumnosEdA;
import Vistas.tutAlumnosEdE;
import Vistas.tutAlumnosEdM;
import Vistas.tutEmpresas;
import Vistas.tutEmpresasA;
import Vistas.tutEmpresasB;
import Vistas.tutEmpresasE;
import Vistas.tutEmpresasM;
import Vistas.tutGrupos;
import Vistas.tutGruposB;
import Vistas.tutor;
import Vistas.verificacion;

public class Lanzadera {
	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		configLogin configLogin = new configLogin();
		crearCuenta crearCuenta = new crearCuenta();
		datosTutEmp datosTutEmp = new datosTutEmp();
		dirAlumnos dirAlumnos = new dirAlumnos();
		dirAlumnosB dirAlumnosB = new dirAlumnosB();
		dirAlumnosEd dirAlumnosEd = new dirAlumnosEd();
		dirAlumnosEdA dirAlumnosEdA = new dirAlumnosEdA();
		dirAlumnosEdE dirAlumnosEdE = new dirAlumnosEdE();
		dirAlumnosEdM dirAlumnosEdM = new dirAlumnosEdM();
		director director = new director();
		dirEmpresas dirEmpresas = new dirEmpresas();
		dirEmpresasA dirEmpresasA = new dirEmpresasA();
		dirEmpresasB dirEmpresasB = new dirEmpresasB();
		dirEmpresasE dirEmpresasE = new dirEmpresasE();
		dirEmpresasM dirEmpresasM = new dirEmpresasM();
		dirGrupos dirGrupos = new dirGrupos();
		dirGruposB dirGruposB = new dirGruposB();
		dirInformes dirInformes = new dirInformes();
		dirTutores dirTutores = new dirTutores();
		dirTutoresA dirTutoresA = new dirTutoresA();
		dirTutoresB dirTutoresB = new dirTutoresB();
		dirTutoresE dirTutoresE = new dirTutoresE();
		dirTutoresM dirTutoresM = new dirTutoresM();
		empAlumnos empAlumnos = new empAlumnos();
		empAlumnosB empAlumnosB = new empAlumnosB();
		empresa empresa = new empresa();
		empTutores empTutores = new empTutores();
		empTutoresB empTutoresB = new empTutoresB();
		login login = new login();
		tutAlumnos tutAlumnos = new tutAlumnos();
		tutAlumnosB tutAlumnosB = new tutAlumnosB();
		tutAlumnosEd tutAlumnosEd = new tutAlumnosEd();
		tutAlumnosEdA tutAlumnosEdA = new tutAlumnosEdA();
		tutAlumnosEdE tutAlumnosEdE = new tutAlumnosEdE();
		tutAlumnosEdM tutAlumnosEdM = new tutAlumnosEdM();
		tutEmpresas tutEmpresas = new tutEmpresas();
		tutEmpresasA tutEmpresasA = new tutEmpresasA();
		tutEmpresasB tutEmpresasB = new tutEmpresasB();
		tutEmpresasE tutEmpresasE = new tutEmpresasE();
		tutEmpresasM tutEmpresasM = new tutEmpresasM();
		tutGrupos tutGrupos = new tutGrupos();
		tutGruposB tutGruposB = new tutGruposB();
		tutor tutor = new tutor();
		verificacion verificacion = new verificacion();
		
		miControlador.setMiModelo(miModelo);
		miControlador.setConfigLogin(configLogin);
		miControlador.setCrearCuenta(crearCuenta);
		miControlador.setDatosTutEmp(datosTutEmp);
		miControlador.setDirAlumnos(dirAlumnos);
		miControlador.setDirAlumnosB(dirAlumnosB);
		miControlador.setDirAlumnosEd(dirAlumnosEd);
		miControlador.setDirAlumnosEdA(dirAlumnosEdA);
		miControlador.setDirAlumnosEdE(dirAlumnosEdE);
		miControlador.setDirAlumnosEdM(dirAlumnosEdM);
		miControlador.setDirector(director);
		miControlador.setDirEmpresas(dirEmpresas);
		miControlador.setDirEmpresasA(dirEmpresasA);
		miControlador.setDirEmpresasB(dirEmpresasB);
		miControlador.setDirEmpresasE(dirEmpresasE);
		miControlador.setDirEmpresasM(dirEmpresasM);
		miControlador.setDirGrupos(dirGrupos);
		miControlador.setDirGruposB(dirGruposB);
		miControlador.setDirInformes(dirInformes);
		miControlador.setDirTutores(dirTutores);
		miControlador.setDirTutoresA(dirTutoresA);
		miControlador.setDirTutoresB(dirTutoresB);
		miControlador.setDirTutoresE(dirTutoresE);
		miControlador.setDirTutoresM(dirTutoresM);
		miControlador.setEmpAlumnos(empAlumnos);
		miControlador.setEmpAlumnosB(empAlumnosB);
		miControlador.setEmpresa(empresa);
		miControlador.setEmpTutores(empTutores);
		miControlador.setEmpTutoresB(empTutoresB);
		miControlador.setLogin(login);
		miControlador.setTutAlumnos(tutAlumnos);
		miControlador.setTutAlumnosB(tutAlumnosB);
		miControlador.setTutAlumnosEd(tutAlumnosEd);
		miControlador.setTutAlumnosEdA(tutAlumnosEdA);
		miControlador.setTutAlumnosEdE(tutAlumnosEdE);
		miControlador.setTutAlumnosEdM(tutAlumnosEdM);
		miControlador.setTutEmpresas(tutEmpresas);
		miControlador.setTutEmpresasA(tutEmpresasA);
		miControlador.setTutEmpresasB(tutEmpresasB);
		miControlador.setTutEmpresasE(tutEmpresasE);
		miControlador.setTutEmpresasM(tutEmpresasM);
		miControlador.setTutGrupos(tutGrupos);
		miControlador.setTutGruposB(tutGruposB);
		miControlador.setTutor(tutor);
		miControlador.setVerificacion(verificacion);
		miControlador.setVentanaActiva(login);
		
		miModelo.setConfigLogin(configLogin);
		miModelo.setCrearCuenta(crearCuenta);
		miModelo.setDatosTutEmp(datosTutEmp);
		miModelo.setDirAlumnos(dirAlumnos);
		miModelo.setDirAlumnosB(dirAlumnosB);
		miModelo.setDirAlumnosEd(dirAlumnosEd);
		miModelo.setDirAlumnosEdA(dirAlumnosEdA);
		miModelo.setDirAlumnosEdE(dirAlumnosEdE);
		miModelo.setDirAlumnosEdM(dirAlumnosEdM);
		miModelo.setDirector(director);
		miModelo.setDirEmpresas(dirEmpresas);
		miModelo.setDirEmpresasA(dirEmpresasA);
		miModelo.setDirEmpresasB(dirEmpresasB);
		miModelo.setDirEmpresasE(dirEmpresasE);
		miModelo.setDirEmpresasM(dirEmpresasM);
		miModelo.setDirGrupos(dirGrupos);
		miModelo.setDirGruposB(dirGruposB);
		miModelo.setDirInformes(dirInformes);
		miModelo.setDirTutores(dirTutores);
		miModelo.setDirTutoresA(dirTutoresA);
		miModelo.setDirTutoresB(dirTutoresB);
		miModelo.setDirTutoresE(dirTutoresE);
		miModelo.setDirTutoresM(dirTutoresM);
		miModelo.setEmpAlumnos(empAlumnos);
		miModelo.setEmpAlumnosB(empAlumnosB);
		miModelo.setEmpresa(empresa);
		miModelo.setEmpTutores(empTutores);
		miModelo.setEmpTutoresB(empTutoresB);
		miModelo.setLogin(login);
		miModelo.setTutAlumnos(tutAlumnos);
		miModelo.setTutAlumnosB(tutAlumnosB);
		miModelo.setTutAlumnosEd(tutAlumnosEd);
		miModelo.setTutAlumnosEdA(tutAlumnosEdA);
		miModelo.setTutAlumnosEdE(tutAlumnosEdE);
		miModelo.setTutAlumnosEdM(tutAlumnosEdM);
		miModelo.setTutEmpresas(tutEmpresas);
		miModelo.setTutEmpresasA(tutEmpresasA);
		miModelo.setTutEmpresasB(tutEmpresasB);
		miModelo.setTutEmpresasE(tutEmpresasE);
		miModelo.setTutEmpresasM(tutEmpresasM);
		miModelo.setTutGrupos(tutGrupos);
		miModelo.setTutGruposB(tutGruposB);
		miModelo.setTutor(tutor);
		miModelo.setVerificacion(verificacion);
		
		configLogin.setControlador(miControlador);
		configLogin.setModelo(miModelo);
		
		crearCuenta.setControlador(miControlador);
		crearCuenta.setModelo(miModelo);
	
		datosTutEmp.setControlador(miControlador);
		datosTutEmp.setModelo(miModelo);
		
		dirAlumnos.setControlador(miControlador);
		dirAlumnos.setModelo(miModelo);
		
		dirAlumnosB.setControlador(miControlador);
		dirAlumnosB.setModelo(miModelo);
		
		dirAlumnosEd.setControlador(miControlador);
		dirAlumnosEd.setModelo(miModelo);
		
		dirAlumnosEdA.setControlador(miControlador);
		dirAlumnosEdA.setModelo(miModelo);
		
		dirAlumnosEdE.setControlador(miControlador);
		dirAlumnosEdE.setModelo(miModelo);
		
		dirAlumnosEdM.setControlador(miControlador);
		dirAlumnosEdM.setModelo(miModelo);
		
		director.setControlador(miControlador);
		director.setModelo(miModelo);
		
		dirEmpresas.setControlador(miControlador);
		dirEmpresas.setModelo(miModelo);
		
		dirEmpresasA.setControlador(miControlador);
		dirEmpresasA.setModelo(miModelo);
		
		dirEmpresasB.setControlador(miControlador);
		dirEmpresasB.setModelo(miModelo);
		
		dirEmpresasE.setControlador(miControlador);
		dirEmpresasE.setModelo(miModelo);
		
		dirEmpresasM.setControlador(miControlador);
		dirEmpresasM.setModelo(miModelo);
		
		dirGrupos.setControlador(miControlador);
		dirGrupos.setModelo(miModelo);
		
		dirGruposB.setControlador(miControlador);
		dirGruposB.setModelo(miModelo);
		
		dirInformes.setControlador(miControlador);
		dirInformes.setModelo(miModelo);
		
		dirTutores.setControlador(miControlador);
		dirTutores.setModelo(miModelo);
		
		dirTutoresA.setControlador(miControlador);
		dirTutoresA.setModelo(miModelo);
		
		dirTutoresB.setControlador(miControlador);
		dirTutoresB.setModelo(miModelo);
		
		dirTutoresE.setControlador(miControlador);
		dirTutoresE.setModelo(miModelo);
		
		dirTutoresM.setControlador(miControlador);
		dirTutoresM.setModelo(miModelo);
		
		empAlumnos.setControlador(miControlador);
		empAlumnos.setModelo(miModelo);
		
		empAlumnosB.setControlador(miControlador);
		empAlumnosB.setModelo(miModelo);
		
		empresa.setControlador(miControlador);
		empresa.setModelo(miModelo);
		
		empTutores.setControlador(miControlador);
		empTutores.setModelo(miModelo);
		
		empTutoresB.setControlador(miControlador);
		empTutoresB.setModelo(miModelo);
		
		login.setControlador(miControlador);
		login.setModelo(miModelo);
		
        tutAlumnos.setControlador(miControlador);
		tutAlumnos.setModelo(miModelo);
		
		tutAlumnosB.setControlador(miControlador);
		tutAlumnosB.setModelo(miModelo);
		
		tutAlumnosEd.setControlador(miControlador);
		tutAlumnosEd.setModelo(miModelo);
		
		tutAlumnosEdA.setControlador(miControlador);
		tutAlumnosEdA.setModelo(miModelo);
		
		tutAlumnosEdE.setControlador(miControlador);
		tutAlumnosEdE.setModelo(miModelo);
		
		tutAlumnosEdM.setControlador(miControlador);
		tutAlumnosEdM.setModelo(miModelo);
		
		tutEmpresas.setControlador(miControlador);
		tutEmpresas.setModelo(miModelo);
		
		tutEmpresasA.setControlador(miControlador);
		tutEmpresasA.setModelo(miModelo);
		
		tutEmpresasB.setControlador(miControlador);
		tutEmpresasB.setModelo(miModelo);
		
		tutEmpresasE.setControlador(miControlador);
		tutEmpresasE.setModelo(miModelo);
		
		tutEmpresasM.setControlador(miControlador);
		tutEmpresasM.setModelo(miModelo);
		
		tutGrupos.setControlador(miControlador);
		tutGrupos.setModelo(miModelo);
		
		tutGruposB.setControlador(miControlador);
		tutGruposB.setModelo(miModelo);
		
		tutor.setControlador(miControlador);
		tutor.setModelo(miModelo);
		
		verificacion.setControlador(miControlador);
		verificacion.setModelo(miModelo);
		
		login.setVisible(true);
		director.setVisible(false);
		tutor.setVisible(false);
		empresa.setVisible(false);
	}
}
