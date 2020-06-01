package Aplicacion;


import Vistas.configLogin;
import Vistas.crearCuenta;
import Vistas.datosTutEmp;
import Vistas.dirAlumnos;
import Vistas.dirAlumnosB;
import Vistas.dirAlumnosEd;
import Vistas.dirAlumnosEdA;
import Vistas.dirAlumnosEdE;
import Vistas.dirGrupos;
import Vistas.dirGruposB;
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
import Vistas.dirAlumnosEdM;
import Vistas.dirEmpresas;
import Vistas.dirEmpresasA;
import Vistas.dirEmpresasB;
import Vistas.dirEmpresasE;
import Vistas.dirEmpresasM;

public class Controlador {
	private Modelo miModelo;
	private configLogin configLogin;
	private crearCuenta crearCuenta;
	private datosTutEmp datosTutEmp;
	private dirAlumnos dirAlumnos;
	private dirAlumnosB dirAlumnosB;
	private dirAlumnosEd dirAlumnosEd;
	private dirAlumnosEdA dirAlumnosEdA;
	private dirAlumnosEdE dirAlumnosEdE;
	private dirAlumnosEdM dirAlumnosEdM;
	private director director;
	private dirEmpresas dirEmpresas;
	private dirEmpresasA dirEmpresasA;
	private dirEmpresasB dirEmpresasB;
	private dirEmpresasE dirEmpresasE;
	private dirEmpresasM dirEmpresasM;
	private dirGrupos dirGrupos;
	private dirGruposB dirGruposB;
	private dirTutores dirTutores;
	private dirTutoresA dirTutoresA;
	private dirTutoresB dirTutoresB;
	private dirTutoresE dirTutoresE;
	private dirTutoresM dirTutoresM;
	private empAlumnos empAlumnos;
	private empAlumnosB empAlumnosB;
	private empresa empresa;
	private empTutores empTutores;
	private empTutoresB empTutoresB;
	private login login;
	private tutAlumnos tutAlumnos;
	private tutAlumnosB tutAlumnosB;
	private tutAlumnosEd tutAlumnosEd;
	private tutAlumnosEdA tutAlumnosEdA;
	private tutAlumnosEdE tutAlumnosEdE;
	private tutAlumnosEdM tutAlumnosEdM;
	private tutEmpresas tutEmpresas;
	private tutEmpresasA tutEmpresasA;
	private tutEmpresasB tutEmpresasB;
	private tutEmpresasE tutEmpresasE;
	private tutEmpresasM tutEmpresasM;
	private tutGrupos tutGrupos;
	private tutGruposB tutGruposB;
	private tutor tutor;
	private verificacion verificacion;
	private Vistas ventanaActiva;

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setConfigLogin(configLogin configLogin) {
		this.configLogin = configLogin;
	}
	
	public void setCrearCuenta(crearCuenta crearCuenta) {
		this.crearCuenta = crearCuenta;
	}

	public void setDatosTutEmp(datosTutEmp datosTutEmp) {
		this.datosTutEmp = datosTutEmp;
	}
	
	public void setDirAlumnos(dirAlumnos dirAlumnos) {
		this.dirAlumnos = dirAlumnos;
	}

	public void setDirAlumnosB(dirAlumnosB dirAlumnosB) {
		this.dirAlumnosB = dirAlumnosB;
	}

	public void setDirAlumnosEd(dirAlumnosEd dirAlumnosEd) {
		this.dirAlumnosEd = dirAlumnosEd;
	}

	public void setDirAlumnosEdA(dirAlumnosEdA dirAlumnosEdA) {
		this.dirAlumnosEdA = dirAlumnosEdA;
	}

	public void setDirAlumnosEdE(dirAlumnosEdE dirAlumnosEdE) {
		this.dirAlumnosEdE = dirAlumnosEdE;
	}

	public void setDirAlumnosEdM(dirAlumnosEdM dirAlumnosEdM) {
		this.dirAlumnosEdM = dirAlumnosEdM;
	}

	public void setDirector(director director) {
		this.director = director;
	}

	public void setDirEmpresas(dirEmpresas dirEmpresas) {
		this.dirEmpresas = dirEmpresas;
	}

	public void setDirEmpresasA(dirEmpresasA dirEmpresasA) {
		this.dirEmpresasA = dirEmpresasA;
	}

	public void setDirEmpresasB(dirEmpresasB dirEmpresasB) {
		this.dirEmpresasB = dirEmpresasB;
	}

	public void setDirEmpresasE(dirEmpresasE dirEmpresasE) {
		this.dirEmpresasE = dirEmpresasE;
	}

	public void setDirEmpresasM(dirEmpresasM dirEmpresasM) {
		this.dirEmpresasM = dirEmpresasM;
	}

	public void setDirGrupos(dirGrupos dirGrupos) {
		this.dirGrupos = dirGrupos;
	}

	public void setDirGruposB(dirGruposB dirGruposB) {
		this.dirGruposB = dirGruposB;
	}

	public void setDirTutores(dirTutores dirTutores) {
		this.dirTutores = dirTutores;
	}

	public void setDirTutoresA(dirTutoresA dirTutoresA) {
		this.dirTutoresA = dirTutoresA;
	}

	public void setDirTutoresB(dirTutoresB dirTutoresB) {
		this.dirTutoresB = dirTutoresB;
	}

	public void setDirTutoresE(dirTutoresE dirTutoresE) {
		this.dirTutoresE = dirTutoresE;
	}

	public void setDirTutoresM(dirTutoresM dirTutoresM) {
		this.dirTutoresM = dirTutoresM;
	}

	public void setEmpAlumnos(empAlumnos empAlumnos) {
		this.empAlumnos = empAlumnos;
	}

	public void setEmpAlumnosB(empAlumnosB empAlumnosB) {
		this.empAlumnosB = empAlumnosB;
	}

	public void setEmpresa(empresa empresa) {
		this.empresa = empresa;
	}

	public void setEmpTutores(empTutores empTutores) {
		this.empTutores = empTutores;
	}

	public void setEmpTutoresB(empTutoresB empTutoresB) {
		this.empTutoresB = empTutoresB;
	}

	public void setLogin(login login) {
		this.login = login;
	}

	public void setTutAlumnos(tutAlumnos tutAlumnos) {
		this.tutAlumnos = tutAlumnos;
	}

	public void setTutAlumnosB(tutAlumnosB tutAlumnosB) {
		this.tutAlumnosB = tutAlumnosB;
	}

	public void setTutAlumnosEd(tutAlumnosEd tutAlumnosEd) {
		this.tutAlumnosEd = tutAlumnosEd;
	}

	public void setTutAlumnosEdA(tutAlumnosEdA tutAlumnosEdA) {
		this.tutAlumnosEdA = tutAlumnosEdA;
	}

	public void setTutAlumnosEdE(tutAlumnosEdE tutAlumnosEdE) {
		this.tutAlumnosEdE = tutAlumnosEdE;
	}

	public void setTutAlumnosEdM(tutAlumnosEdM tutAlumnosEdM) {
		this.tutAlumnosEdM = tutAlumnosEdM;
	}

	public void setTutEmpresas(tutEmpresas tutEmpresas) {
		this.tutEmpresas = tutEmpresas;
	}

	public void setTutEmpresasA(tutEmpresasA tutEmpresasA) {
		this.tutEmpresasA = tutEmpresasA;
	}

	public void setTutEmpresasB(tutEmpresasB tutEmpresasB) {
		this.tutEmpresasB = tutEmpresasB;
	}

	public void setTutEmpresasE(tutEmpresasE tutEmpresasE) {
		this.tutEmpresasE = tutEmpresasE;
	}

	public void setTutEmpresasM(tutEmpresasM tutEmpresasM) {
		this.tutEmpresasM = tutEmpresasM;
	}

	public void setTutGrupos(tutGrupos tutGrupos) {
		this.tutGrupos = tutGrupos;
	}

	public void setTutGruposB(tutGruposB tutGruposB) {
		this.tutGruposB = tutGruposB;
	}

	public void setTutor(tutor tutor) {
		this.tutor = tutor;
	}

	public void setVerificacion(verificacion verificacion) {
		this.verificacion = verificacion;
	}
	
	public void setVentanaActiva(Vistas vista) {
		this.ventanaActiva = vista;		
	}
	
	
	public void configLogin() {
		ventanaActiva.setVisible(false);
		configLogin.actualizar();
		configLogin.setVisible(true);
		ventanaActiva = configLogin;
		
	}

	public void Verificacion() {
		ventanaActiva.setVisible(false);
		verificacion.setVisible(true);
		ventanaActiva = verificacion;
		
	}

	public void crearNuevaCuenta() {
		ventanaActiva.setVisible(false);
		crearCuenta.setVisible(true);
		ventanaActiva = crearCuenta;
	}

	public void volverLogin() {
		ventanaActiva.setVisible(false);
		login.setVisible(true);
		ventanaActiva = login;
	}

	public void cerrarSesion() {
		ventanaActiva.setVisible(false);
		login.setVisible(true);
		ventanaActiva = login;
	}
	
	public void datosTutEmp() {
		ventanaActiva.setVisible(false);
		datosTutEmp.setVisible(true);
		ventanaActiva = datosTutEmp;
	}

	public void volverDirector() {
		ventanaActiva.setVisible(false);
		director.setVisible(true);
		ventanaActiva = director;
	}

	public void volverEmpresa() {
		ventanaActiva.setVisible(false);
		empresa.setVisible(true);
		ventanaActiva = empresa;
	}

	public void volverTutor() {
		ventanaActiva.setVisible(false);
		tutor.setVisible(true);
		ventanaActiva = tutor;

	}

	public void directorAlumno() {
		ventanaActiva.setVisible(false);
		dirAlumnos.setVisible(true);
		ventanaActiva = dirAlumnos;
	}


	public void directorAlumnoBuscar() {
		ventanaActiva.setVisible(false);
		dirAlumnosB.setVisible(true);
		ventanaActiva =dirAlumnosB;


	}

	public void directorAlumnoEditar() {
		ventanaActiva.setVisible(false);
		dirAlumnosEd.setVisible(true);
		ventanaActiva =dirAlumnosEd;
	}

	public void directorAlumnoEditarAnadir() {
		ventanaActiva.setVisible(false);
		dirAlumnosEdA.setVisible(true);
		ventanaActiva =dirAlumnosEdA;

	}

	public void directorAlumnoEditarEliminar() {
		ventanaActiva.setVisible(false);
		dirAlumnosEdE.setVisible(true);
		ventanaActiva =dirAlumnosEdE;

	}

	public void directorAlumnoEditarModificar() {
		ventanaActiva.setVisible(false);
		dirAlumnosEdM.setVisible(true);
		ventanaActiva =dirAlumnosEdM;
	}

	public void directorEmpresas() {
		ventanaActiva.setVisible(false);
		dirEmpresas.setVisible(true);
		ventanaActiva =dirEmpresas;
	}

	public void directorEmpresasAnadir() {
		ventanaActiva.setVisible(false);
		dirEmpresasA.setVisible(true);
		ventanaActiva =dirEmpresasA;
	}

	public void directorEmpresasBuscar() {
		ventanaActiva.setVisible(false);
		dirEmpresasB.setVisible(true);
		ventanaActiva =dirEmpresasB;
	}

	public void directorEmpresasEliminar() {
		ventanaActiva.setVisible(false);
		dirEmpresasE.setVisible(true);
		ventanaActiva =dirEmpresasE;
	}

	public void directorEmpresasModificar() {
		ventanaActiva.setVisible(false);
		dirEmpresasM.setVisible(true);
		ventanaActiva =dirEmpresasM;
	}

	public void directorGrupos() {
		ventanaActiva.setVisible(false);
		dirGrupos.setVisible(true);
		ventanaActiva =dirGrupos;
	}

	public void directorGruposBuscar() {
		ventanaActiva.setVisible(false);
		dirGruposB.setVisible(true);
		ventanaActiva =dirGruposB;
	}

	public void directorTutores() {
		ventanaActiva.setVisible(false);
		dirTutores.setVisible(true);
		ventanaActiva =dirTutores;
	}

	public void directorTutoresAnadir() {
		ventanaActiva.setVisible(false);
		dirTutoresA.setVisible(true);
		ventanaActiva =dirTutoresA;
	}

	public void directorTutoresBuscar() {
		ventanaActiva.setVisible(false);
		dirTutoresB.setVisible(true);
		ventanaActiva =dirTutoresB;
	}

	public void directorTutoresEliminar() {
		ventanaActiva.setVisible(false);
		dirTutoresE.setVisible(true);
		ventanaActiva =dirTutoresE;
	}

	public void directorTutoresModificar() {
		ventanaActiva.setVisible(false);
		dirTutoresM.setVisible(true);
		ventanaActiva =dirTutoresM;
	}

	public void empresaAlumnos() {
		ventanaActiva.setVisible(false);
		empAlumnos.setVisible(true);
		ventanaActiva =empAlumnos;
	}

	public void empresaAlumnosBuscar() {
		ventanaActiva.setVisible(false);
		empAlumnosB.setVisible(true);
		ventanaActiva =empAlumnosB;
	}

	public void empresaTutores() {
		ventanaActiva.setVisible(false);
		empTutores.setVisible(true);
		ventanaActiva =empTutores;
	}

	public void empresaTutoresBuscar() {
		ventanaActiva.setVisible(false);
		empTutoresB.setVisible(true);
		ventanaActiva =empTutoresB;
	}

	public void tutorAlumnos() {
		tutAlumnos.actualizarTabla();
		ventanaActiva.setVisible(false);
		tutAlumnos.setVisible(true);
		ventanaActiva =tutAlumnos;
	}


	public void tutorAlumnosBuscar() {
		ventanaActiva.setVisible(false);
		tutAlumnosB.setVisible(true);
		ventanaActiva =tutAlumnosB;
	}

	public void tutorAlumnosEditar() {
		ventanaActiva.setVisible(false);
		tutAlumnosEd.setVisible(true);
		ventanaActiva =tutAlumnosEd;
	}

	public void tutorAlumnosEditarAnadir() {
		ventanaActiva.setVisible(false);
		tutAlumnosEdA.setVisible(true);
		ventanaActiva =tutAlumnosEdA;
	}

	public void tutorAlumnosEditarEliminar() {
		ventanaActiva.setVisible(false);
		tutAlumnosEdE.setVisible(true);
		ventanaActiva =tutAlumnosEdE;
	}

	public void tutorAlumnosEditarModificar() {
		ventanaActiva.setVisible(false);
		tutAlumnosEdM.setVisible(true);
		ventanaActiva =tutAlumnosEdM;
	}

	public void tutorEmpresas() {
		ventanaActiva.setVisible(false);
		tutEmpresas.setVisible(true);
		ventanaActiva =tutEmpresas;
	}

	public void tutorEmpresasAnadir() {
		ventanaActiva.setVisible(false);
		tutEmpresasA.setVisible(true);
		ventanaActiva =tutEmpresasA;
	}

	public void tutorEmpresasBuscar() {
		ventanaActiva.setVisible(false);
		tutEmpresasB.setVisible(true);
		ventanaActiva =tutEmpresasB;
	}

	public void tutorEmpresasEliminar() {
		ventanaActiva.setVisible(false);
		tutEmpresasE.setVisible(true);
		ventanaActiva =tutEmpresasE;
	}

	public void tutorEmpresasModificar() {
		ventanaActiva.setVisible(false);
		tutEmpresasM.setVisible(true);
		ventanaActiva =tutEmpresasM;
	}

	public void tutorGrupos() {
		ventanaActiva.setVisible(false);
		tutGrupos.setVisible(true);
		ventanaActiva =tutGrupos;
	}

	public void tutorGruposBuscar() {
		ventanaActiva.setVisible(false);
		tutGruposB.setVisible(true);
		ventanaActiva = tutGruposB;
	}
	
	public void actualizarBD() {
		miModelo.actualizarBD(configLogin.getUserBD(), configLogin.getPasswdBD(), configLogin.getUrlBD());
	}

	public void comprobarVerificacion() {
		miModelo.comprobarVerificacionCuenta(verificacion.getRdButton(), verificacion.getCodVerificacion());
	}
	
	public void accesoLogin() {
		miModelo.iniciarSesion(login.getUsr(), login.getPwd());
	}

	public void insertarUsuario() {
		miModelo.insertarNuevoUsuario(crearCuenta.getNombreUsuario(), crearCuenta.getPasswd(), verificacion.getRdButton());
	}

	public void insertarTutEmp() {
		miModelo.insertarNuevoTutEmp(datosTutEmp.getNombre(), datosTutEmp.getApellido(), datosTutEmp.getDNI(), datosTutEmp.getCodCentro(), datosTutEmp.getNomUsr());
	}
	
	public void tutorInsertarAlumno() {
		miModelo.tutorInsertarAlumno(tutAlumnosEdA.getTxtNumExpediente(), tutAlumnosEdA.getTxtDNI(), tutAlumnosEdA.getTxtNombre(), tutAlumnosEdA.getTxtApellidos(), tutAlumnosEdA.getTxtFechaNac(), tutAlumnosEdA.getTxtNacionalidad(), tutAlumnosEdA.getTxtCodGrupo(), tutAlumnosEdA.getTxtAnoAcademico());
	}

	public void tutorInsertarEmpresa() {
		miModelo.tutorInsertarEmpresa(tutEmpresasA.getTxtNombre(), tutEmpresasA.getTxtCIF(), tutEmpresasA.getTxtDireccion(), tutEmpresasA.getTxtLocalidad(), tutEmpresasA.getTxtTelefono(), tutEmpresasA.getTxtEmail(), tutEmpresasA.getTxtResponsableEmpresa());
	}

	public void directorInsertarAlumno() {
		miModelo.directorInsertarAlumno(dirAlumnosEdA.getTxtNumExpediente(), dirAlumnosEdA.getTxtDNI(), dirAlumnosEdA.getTxtNombre(), dirAlumnosEdA.getTxtApellidos(), dirAlumnosEdA.getTxtFechaNac(), dirAlumnosEdA.getTxtNacionalidad(), dirAlumnosEdA.getTxtCodGrupo(), dirAlumnosEdA.getTxtAnoAcademico());
	}

	public void directorInsertarEmpresa() {
		miModelo.directorInsertarEmpresa(dirEmpresasA.getTxtNombre(), dirEmpresasA.getTxtCIF(), dirEmpresasA.getTxtDireccion(), dirEmpresasA.getTxtLocalidad(), dirEmpresasA.getTxtTelefono(), dirEmpresasA.getTxtEmail(), dirEmpresasA.getTxtResponsableEmpresa());
	}

	public void directorBorrarAlumno() {
		miModelo.directorBorrarAlumno(dirAlumnosEdE.getTxtNombre(), dirAlumnosEdE.getTxtId());
	}

	public void tutorBorrarAlumno() {
		miModelo.tutorBorrarAlumno(tutAlumnosEdE.getTxtNombre(), tutAlumnosEdE.getTxtId());
	}

	public void directorBorrarEmpresa() {
		miModelo.directorBorrarEmpresa(dirEmpresasE.getTxtNombre(), dirEmpresasE.getTxtCIF());
	}

	public void tutorBorrarEmpresa() {
		miModelo.tutorBorrarEmpresa(tutEmpresasE.getTxtNombre(), tutEmpresasE.getTxtCIF());
	}

	public void directormodificarAlumno() {
		miModelo.directorModificarAlumno(dirAlumnosEdM.getTxtModificacion(), dirAlumnosEdM.getEleccion(), dirAlumnosEdM.getTxtExpediente());
	}

	public void directorModificarEmpresa() {
		miModelo.directorModificarEmpresa(dirEmpresasM.getTxtModificacion(), dirEmpresasM.getEleccion(), dirEmpresasM.getTxtCIF());
	}

	public void tutorModificarEmpresa() {
		miModelo.tutorModificarEmpresa(tutEmpresasM.getTxtModificacion(), tutEmpresasM.getEleccion(), tutEmpresasM.getTxtCIF());
	}

	public void tutorModificarAlumno() {
		miModelo.tutorModificarAlumno(tutAlumnosEdM.getTxtModificacion(), tutAlumnosEdM.getEleccion(), tutAlumnosEdM.getTxtExpediente());
	}
	
	
}
