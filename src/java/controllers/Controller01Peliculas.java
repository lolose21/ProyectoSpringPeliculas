package controllers;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Peliculas;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import repositories.RepositoryPeliculas;

public class Controller01Peliculas extends MultiActionController {

    RepositoryPeliculas repo;

    private Object getBean(String id, ServletContext context) {
        ApplicationContext container
                = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }

    public ModelAndView inicio(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        ModelAndView mv = new ModelAndView("web01tablapeliculas");
        this.repo = (RepositoryPeliculas) this.getBean("repositorypeliculas",
                request.getServletContext());
        List<Peliculas> peliculas = this.repo.getTablaPeliculas();
        mv.addObject("PELICULAS", peliculas);
        return mv;
    }

    public ModelAndView tablaPeliculas(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ModelAndView mv = new ModelAndView("web01tablapeliculas");

        this.repo = (RepositoryPeliculas) this.getBean("repositorypeliculas",
                request.getServletContext());
        List<Peliculas> peliculas = this.repo.getTablaPeliculas();
        mv.addObject("PELICULAS", peliculas);
        return mv;
    }

}
