package repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Peliculas;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class RepositoryPeliculas {

    DriverManagerDataSource dataSource;

    public RepositoryPeliculas(DriverManagerDataSource datasource) {
        this.dataSource = datasource;
    }

    public List<Peliculas> getTablaPeliculas() throws SQLException {
        Connection cn = dataSource.getConnection();
        String sql = "select * from peliculas";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Peliculas> peliculas = new ArrayList<>();
        while (rs.next()) {
            int idpelicula = rs.getInt("idpelicula");
            int iddistribuidor = rs.getInt("iddistribuidor");
            int idgenero = rs.getInt("idgenero");
            String titulo = rs.getString("titulo");
            int idnacionalidad = rs.getInt("idnacionalidad");
            String actores = rs.getString("actores");

            Peliculas pelis = new Peliculas(idpelicula, iddistribuidor, idgenero, titulo, idnacionalidad, actores);
            peliculas.add(pelis);

        }
        cn.close();
        rs.close();
        return peliculas;
    }

}
