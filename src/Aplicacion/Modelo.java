package Aplicacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

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

public class Modelo {
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
	private Properties datosBD;
	private File miFichero;
	private InputStream entrada;
	private OutputStream salida;
	private final String loginBD = "loginBD.ini";
	private String user;
	private String passwd;
	private String db = "ProyectoIntegrador";
	private String url;
	private Connection conexion;
	private String resultado;
	private int intentos;
	private String rol;
	private String nombre;
	private DefaultTableModel tabla;
	private String sqlDirAlumnos;
	private DefaultTableModel tablaDirAlumnos;
	private String sqlDirTutores;
	private DefaultTableModel tablaDirTutores;
	private String sqlDirEmpresas;
	private DefaultTableModel tablaDirEmpresas;
	private String sqlDirGrupos;
	private DefaultTableModel tablaDirGrupos;
	private String sqlTutEmpAlumnos;
	private DefaultTableModel tablaTutEmpAlumnos;
	private String sqlTutEmpresas;
	private DefaultTableModel tablaTutEmpresas;
	private String sqlTutGrupos;
	private DefaultTableModel tablaTutGrupos;
	private String sqlEmpTutores;
	private DefaultTableModel tablaEmpTutores;

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

	public Modelo() {
		try {
			// Este sirve para Oracle
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			// Este sirve para MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			cargarFicheroBD();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC no encontrado");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de conexion. Comprobar datos en la configuracion de conexion");
			e.printStackTrace();
		}
	}

	public void cargarFicheroBD() {
		datosBD = new Properties();
		try {
			miFichero = new File(loginBD);
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				datosBD.load(entrada);
				this.user = datosBD.getProperty("UsuarioBD");
				this.passwd = datosBD.getProperty("PasswdBD");
				this.url = datosBD.getProperty("UrlBD");
				System.out.println("Fichero BD cargado");
			} else {
				System.err.println("Fichero no encontrado");
				System.exit(1);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void loginBD() {
		try {
			conexion = DriverManager.getConnection(url, user, passwd);
			System.out.println("-> Conexión a la BBDD establecida");
		} catch (SQLException e) {
			System.out.println("Error de conexion. Comprobar datos en la configuracion de conexion");
		}
	}

	public void actualizarBD(String usuarioBD, String passwdBD, String urlBD) {
		miFichero.delete();
		try {
			miFichero.createNewFile();
			datosBD.setProperty("UrlBD", urlBD);
			datosBD.setProperty("PasswdBD", passwdBD);
			datosBD.setProperty("UsuarioBD", usuarioBD);
			salida = new FileOutputStream(miFichero);
			datosBD.store(salida, "Ultima operacion: Guardado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		cargarFicheroBD();
	}

	public String getUser() {
		return user;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUrl() {
		return url;
	}

	public void tablas() {
		tablaDirAlumnos = cargarTabla(sqlDirAlumnos);
		tablaDirTutores = cargarTabla(sqlDirTutores);
		tablaDirEmpresas = cargarTabla(sqlDirEmpresas);
		tablaDirGrupos = cargarTabla(sqlDirGrupos);
		tablaTutEmpAlumnos = cargarTabla(sqlTutEmpAlumnos);
		tablaTutEmpresas = cargarTabla(sqlTutEmpresas);
		tablaTutGrupos = cargarTabla(sqlTutGrupos);
		tablaEmpTutores = cargarTabla(sqlEmpTutores);
	}

	public void terminar() {
		try {
			if (conexion != null)
				conexion.close();
			System.out.println("Base de datos desconectada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void iniciarSesion(String usr, String pwd) {
		String query = "SELECT * FROM ProyectoIntegrador.Users WHERE usr=? AND pwd=?";
		try {
			if (conexion == null) {
				loginBD();
			}
			PreparedStatement pStmt = conexion.prepareStatement(query);
			pStmt.setString(1, usr);
			pStmt.setString(2, pwd);
			ResultSet rset = pStmt.executeQuery();
			if (rset.next()) {
				ejecutarScripts(usr);
				tablas();
				resultado = "Correcto";
				intentos = 0;
				elegirRol(usr, pwd);
				nomUsuario(usr);
			} else {
				intentos++;
				if (intentos == 3) {
					resultado = "Cerrar";
				} else
					resultado = "Incorrecto";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		login.actualizar();
	}

	public String getResultado() {
		return this.resultado;
	}

	public void elegirRol(String usr, String pwd) {
		String query = "SELECT rol FROM ProyectoIntegrador.Users WHERE usr=? AND pwd=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, usr);
			stmt.setString(2, pwd);
			ResultSet rset = stmt.executeQuery();
			rset.next();
			rol = rset.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getRol() {
		return this.rol;
	}

	public void nomUsuario(String usr) {
		String query = "SELECT CONCAT(nombre, ' ', apellido) FROM ProyectoIntegrador.Tutor WHERE users_usr=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, usr);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()) {
				nombre = rset.getString(1);
				if (rol.equals("director")) {
					director.nombre();
					dirAlumnos.nombre();
					dirAlumnosB.nombre();
					dirAlumnosEd.nombre();
					dirAlumnosEdA.nombre();
					dirAlumnosEdE.nombre();
					dirAlumnosEdM.nombre();
					dirEmpresas.nombre();
					dirEmpresasA.nombre();
					dirEmpresasB.nombre();
					dirEmpresasE.nombre();
					dirEmpresasM.nombre();
					dirGrupos.nombre();
					dirGruposB.nombre();
					dirTutores.nombre();
					dirTutoresA.nombre();
					dirTutoresB.nombre();
					dirTutoresE.nombre();
					dirTutoresM.nombre();
				} 
				else if (rol.equals("tutor")) {
					tutor.nombre();
					tutAlumnos.nombre();
					tutAlumnosB.nombre();
					tutAlumnosEd.nombre();
					tutAlumnosEdA.nombre();
					tutAlumnosEdE.nombre();
					tutAlumnosEdM.nombre();
					tutEmpresas.nombre();
					tutEmpresasA.nombre();
					tutEmpresasB.nombre();
					tutEmpresasE.nombre();
					tutEmpresasM.nombre();
					tutGrupos.nombre();
					tutGruposB.nombre();
				} else if (rol.equals("empresa")) {
					empresa.nombre();
					empAlumnos.nombre();
					empAlumnosB.nombre();
					empTutores.nombre();
					empTutoresB.nombre();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String getNombre() {
		return this.nombre;
	}

	public DefaultTableModel cargarTabla(String script) {
		tabla = new DefaultTableModel();
		int numColumnas = getNumColumnas(script);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(script);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				tabla.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				tabla.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tabla;
	}

	private int getNumColumnas(String sql) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public void ejecutarScripts(String usr) {
		this.sqlDirAlumnos = "SELECT * FROM ProyectoIntegrador.Alumno";
		this.sqlDirEmpresas = "SELECT * FROM ProyectoIntegrador.Empresa";
		this.sqlDirGrupos = "SELECT * FROM ProyectoIntegrador.Grupo";
		this.sqlDirTutores = "SELECT * FROM ProyectoIntegrador.Tutor";
		this.sqlTutEmpAlumnos = "SELECT Alumno.* \n" + "FROM Alumno \n" + "LEFT JOIN Pertenece \n"
				+ "ON ProyectoIntegrador.Alumno.expediente=ProyectoIntegrador.Pertenece.alumno_expediente \n"
				+ "LEFT JOIN Grupo \n"
				+ "ON ProyectoIntegrador.Pertenece.grupo_cod_grupo = ProyectoIntegrador.Grupo.cod_grupo \n"
				+ "LEFT JOIN Gestiona \n"
				+ "ON ProyectoIntegrador.Grupo.cod_grupo = ProyectoIntegrador.Gestiona.grupo_cod_grupo \n"
				+ "LEFT JOIN Tutor \n" + "ON ProyectoIntegrador.Gestiona.tutor_dni = ProyectoIntegrador.Tutor.dni \n"
				+ "WHERE Tutor.users_usr='" + usr + "'";
		this.sqlTutEmpresas = "SELECT Empresa.* \n" + "FROM Empresa \n" + "LEFT JOIN Colabora \n"
				+ "ON ProyectoIntegrador.Empresa.cif = ProyectoIntegrador.Colabora.empresa_cif \n"
				+ "LEFT JOIN Centro \n"
				+ "ON ProyectoIntegrador.Colabora.centro_cod_centro = ProyectoIntegrador.Centro.cod_centro \n"
				+ "LEFT JOIN Tutor \n"
				+ "ON ProyectoIntegrador.Centro.cod_centro = ProyectoIntegrador.Tutor.centro_cod_centro \n"
				+ "WHERE Tutor.users_usr='" + usr + "'";
		this.sqlTutGrupos = "SELECT Grupo.* \n" + "FROM Grupo \n" + "LEFT JOIN Gestiona \n"
				+ "ON ProyectoIntegrador.Grupo.cod_grupo = ProyectoIntegrador.Gestiona.grupo_cod_grupo \n"
				+ "LEFT JOIN Tutor \n" + "ON ProyectoIntegrador.Gestiona.tutor_dni = ProyectoIntegrador.Tutor.dni \n"
				+ "WHERE Tutor.users_usr='" + usr + "'";
		this.sqlEmpTutores = "SELECT * FROM ProyectoIntegrador.Tutor WHERE users_usr='" + usr + "'";
	}

	public DefaultTableModel getTablaDirAlumnos() {
		return tablaDirAlumnos;
	}

	public DefaultTableModel getTablaDirTutores() {
		return tablaDirTutores;
	}

	public DefaultTableModel getTablaDirEmpresas() {
		return tablaDirEmpresas;
	}

	public DefaultTableModel getTablaDirGrupos() {
		return tablaDirGrupos;
	}

	public DefaultTableModel getTablaTutAlumnos() {
		return tablaTutEmpAlumnos;
	}

	public DefaultTableModel getTablaTutEmpresas() {
		return tablaTutEmpresas;
	}

	public DefaultTableModel getTablaTutGrupos() {
		return tablaTutGrupos;
	}

	public DefaultTableModel getTablaEmpTutores() {
		return tablaEmpTutores;
	}

	public void comprobarVerificacionCuenta(String rol, String cod) {
		try {
			if (rol.equals("tutor") && cod.equals("tutor123") || rol.equals("empresa") && cod.equals("empresa123")) {
				resultado = "Correcto";
				intentos = 0;
				this.rol = rol;
			} else {
				intentos++;
				if (intentos == 3) {
					resultado = "Cerrar";
				} else
					resultado = "Incorrecto";
			}
		} catch (Exception e) {
			System.out.println("No estan bien los datos o la informacion es incorrecta");
		}
		verificacion.actualizar();
	}

	public void insertarNuevoUsuario(String usr, String pwd, String rol) {
		String query = "INSERT INTO ProyectoIntegrador.Users (usr, pwd, rol) VALUES (?, ?, ?)";
		try {
			if (conexion == null) {
				loginBD();
			}
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, usr);
			stmt.setString(2, pwd);
			stmt.setString(3, rol);
			stmt.executeUpdate();
			System.out.println("Se ha insertado el usuario correctamente");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.user = usr;
		datosTutEmp.actualizar();
	}

	public void insertarNuevoTutEmp(String nom, String ape, String dni, String codc, String usr) {
		String query = "INSERT INTO ProyectoIntegrador.Tutor (nombre, apellido, dni, centro_cod_centro, users_usr) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, nom);
			stmt.setString(2, ape);
			stmt.setString(3, dni);
			stmt.setString(4, codc);
			stmt.setString(5, usr);
			stmt.executeUpdate();
			System.out.println("Se ha insertado el tutor correctamente");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		datosTutEmp.volver();
	}

	public void tutorInsertarAlumno(String txtNumExpediente, String txtDNI, String txtNombre, String txtApellidos,
			String txtFechaNac, String txtNacionalidad, String txtCodGrupo, String txtAnoAcademico) {
		String alumno = "INSERT INTO ProyectoIntegrador.Alumno (expediente, nombre, apellido, dni, fecha_nacimiento, nacionalidad) VALUES (?, ?, ?, ?, ?, ?)";
		String pertenece = "INSERT INTO ProyectoIntegrador.Pertenece (alumno_expediente, grupo_cod_grupo, año_academico) VALUES (?, ?, ?)";
		try {
			PreparedStatement stmtAlumno = conexion.prepareStatement(alumno);
			stmtAlumno.setString(1, txtNumExpediente);
			stmtAlumno.setString(2, txtNombre);
			stmtAlumno.setString(3, txtApellidos);
			stmtAlumno.setString(4, txtDNI);
			stmtAlumno.setString(5, txtFechaNac);
			stmtAlumno.setString(6, txtNacionalidad);
			stmtAlumno.executeUpdate();
			System.out.println("Se ha insertado el alumno correctamente");
			
			PreparedStatement stmtPertenece = conexion.prepareStatement(pertenece);
			stmtPertenece.setString(1, txtNumExpediente);
			stmtPertenece.setString(2, txtCodGrupo);
			stmtPertenece.setString(3, txtAnoAcademico);
			stmtPertenece.executeUpdate();
			System.out.println("Se ha insertado el alumno en el grupo");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		
		tutAlumnosEdA.actualizar();
	}

	public void tutorInsertarEmpresa(String txtNombre, String txtCIF, String txtDireccion, String txtLocalidad,
			String txtTelefono, String txtEmail, String txtResponsableEmpresa) {
		String query = "INSERT INTO ProyectoIntegrador.Empresa (nombre, cif, direccion, localidad, telefono, email, responsable_empresa) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtNombre);
			stmt.setString(2, txtCIF);
			stmt.setString(3, txtDireccion);
			stmt.setString(4, txtLocalidad);
			stmt.setString(5, txtTelefono);
			stmt.setString(6, txtEmail);
			stmt.setString(7, txtResponsableEmpresa);
			stmt.executeUpdate();
			System.out.println("Se ha insertado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		tutEmpresasA.actualizar();		
	}

	public void directorInsertarAlumno(String txtNumExpediente, String txtDNI, String txtNombre, String txtApellidos,
			String txtFechaNac, String txtNacionalidad, String txtCodGrupo, String txtAnoAcademico) {
		String alumno = "INSERT INTO ProyectoIntegrador.Alumno (expediente, nombre, apellido, dni, fecha_nacimiento, nacionalidad) VALUES (?, ?, ?, ?, ?, ?)";
		String pertenece = "INSERT INTO ProyectoIntegrador.Pertenece (alumno_expediente, grupo_cod_grupo, año_academico) VALUES (?, ?, ?)";
		try {
			PreparedStatement stmtAlumno = conexion.prepareStatement(alumno);
			stmtAlumno.setString(1, txtNumExpediente);
			stmtAlumno.setString(2, txtNombre);
			stmtAlumno.setString(3, txtApellidos);
			stmtAlumno.setString(4, txtDNI);
			stmtAlumno.setString(5, txtFechaNac);
			stmtAlumno.setString(6, txtNacionalidad);
			stmtAlumno.executeUpdate();
			System.out.println("Se ha insertado el alumno correctamente");
			
			PreparedStatement stmtPertenece = conexion.prepareStatement(pertenece);
			stmtPertenece.setString(1, txtNumExpediente);
			stmtPertenece.setString(2, txtCodGrupo);
			stmtPertenece.setString(3, txtAnoAcademico);
			stmtPertenece.executeUpdate();
			System.out.println("Se ha insertado el alumno en el grupo");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		
		dirAlumnosEdA.actualizar();
		
	}

	public void directorInsertarEmpresa(String txtNombre, String txtCIF, String txtDireccion, String txtLocalidad,
			String txtTelefono, String txtEmail, String txtResponsableEmpresa) {
		String query = "INSERT INTO ProyectoIntegrador.Empresa (nombre, cif, direccion, localidad, telefono, email, responsable_empresa) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtNombre);
			stmt.setString(2, txtCIF);
			stmt.setString(3, txtDireccion);
			stmt.setString(4, txtLocalidad);
			stmt.setString(5, txtTelefono);
			stmt.setString(6, txtEmail);
			stmt.setString(7, txtResponsableEmpresa);
			stmt.executeUpdate();
			System.out.println("Se ha insertado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirEmpresasA.actualizar();			
	}

	public void directorBorrarAlumno(String txtNombre, String txtId) {
		String alumno = "DELETE FROM ProyectoIntegrador.Alumno WHERE nombre=? AND expediente=?";
		String pertenece = "DELETE FROM ProyectoIntegrador.Pertenece WHERE alumno_expediente=?";
		try {
			PreparedStatement stmtPertenece = conexion.prepareStatement(pertenece);
			stmtPertenece.setString(1, txtId);
			stmtPertenece.executeUpdate();
			System.out.println("Se ha borrado el alumno de la tabla PERTENECE correctamente");
			PreparedStatement stmtAlumno = conexion.prepareStatement(alumno);
			stmtAlumno.setString(1, txtNombre);
			stmtAlumno.setString(2, txtId);
			stmtAlumno.executeUpdate();
			System.out.println("Se ha borrado el alumno de la tabla ALUMNO correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirAlumnosEdE.actualizar();
	}

	public void tutorBorrarAlumno(String txtNombre, String txtId) {
		String alumno = "DELETE FROM ProyectoIntegrador.Alumno WHERE nombre=? AND expediente=?";
		String pertenece = "DELETE FROM ProyectoIntegrador.Pertenece WHERE alumno_expediente=?";
		try {
			PreparedStatement stmtPertenece = conexion.prepareStatement(pertenece);
			stmtPertenece.setString(1, txtId);
			stmtPertenece.executeUpdate();
			System.out.println("Se ha borrado el alumno de la tabla PERTENECE correctamente");
			PreparedStatement stmtAlumno = conexion.prepareStatement(alumno);
			stmtAlumno.setString(1, txtNombre);
			stmtAlumno.setString(2, txtId);
			stmtAlumno.executeUpdate();
			System.out.println("Se ha borrado el alumno de la tabla ALUMNO correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		tutAlumnosEdE.actualizar();
	}

	public void directorBorrarEmpresa(String txtNombre, String txtCIF) {
		String query = "DELETE FROM ProyectoIntegrador.Empresa WHERE nombre=? AND cif=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtNombre);
			stmt.setString(2, txtCIF);
			stmt.executeUpdate();
			System.out.println("Se ha borrado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirEmpresasE.actualizar();
	}

	public void tutorBorrarEmpresa(String txtNombre, String txtCIF) {
		String query = "DELETE FROM ProyectoIntegrador.Empresa WHERE nombre=? AND cif=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtNombre);
			stmt.setString(2, txtCIF);
			stmt.executeUpdate();
			System.out.println("Se ha borrado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		tutEmpresasE.actualizar();
	}

	public void directorModificarAlumno(String txtModificacion, String eleccion, String txtExpediente) {
		String query = "UPDATE ProyectoIntegrador.Alumno SET " + eleccion + "=? WHERE expediente=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtModificacion);
			stmt.setString(2, txtExpediente);
			stmt.executeUpdate();
			System.out.println("Se ha modificado el alumno correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirAlumnosEdM.actualizar();
	}

	public void directorModificarEmpresa(String txtModificacion, String eleccion, String txtCIF) {
		String query = "UPDATE ProyectoIntegrador.Empresa SET " + eleccion + "=? WHERE cif=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtModificacion);
			stmt.setString(2, txtCIF);
			stmt.executeUpdate();
			System.out.println("Se ha modificado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirEmpresasM.actualizar();
	}

	public void tutorModificarEmpresa(String txtModificacion, String eleccion, String txtCIF) {
		String query = "UPDATE ProyectoIntegrador.Empresa SET " + eleccion + "=? WHERE cif=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtModificacion);
			stmt.setString(2, txtCIF);
			stmt.executeUpdate();
			System.out.println("Se ha modificado la empresa correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		dirEmpresasM.actualizar();
	}

	public void tutorModificarAlumno(String txtModificacion, String eleccion, String txtExpediente) {
		String query = "UPDATE ProyectoIntegrador.Alumno SET " + eleccion + "=? WHERE expediente=?";
		try {
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, txtModificacion);
			stmt.setString(2, txtExpediente);
			stmt.executeUpdate();
			System.out.println("Se ha modificado el alumno correctamente");
			resultado = "Correcto";
			tablas();
		} catch (SQLException e) {
			resultado = "Incorrecto";
			e.printStackTrace();
		}
		tutAlumnosEdM.actualizar();
	}

}
