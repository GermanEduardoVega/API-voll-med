//package med.voll.api.controller;
//
//import jakarta.validation.Valid;
//import med.voll.api.medico.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.data.web.PagedResourcesAssembler;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.PagedModel;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/medicos")
//public class MedicoControllerSinWarning {
//    @Autowired
//    private MedicoRepository repository;
//
//    @Autowired // PagedResourcesAssembler se usa para convertir una Page en un PagedModel.
//    private PagedResourcesAssembler<DatosListaMedico> pagedResourcesAssembler;
//    @Autowired // Inyectamos nuestro DatosListaMedicoModelAssembler para convertir DatosListaMedico en EntityModel.
//    private DatosListaMedicoModelAssembler datosListaMedicoModelAssembler;
//    @Transactional
//    @PostMapping
//    public void registrar(@RequestBody @Valid DatosRegistroMedico datos){
//        repository.save(new Medico(datos));
//    }
//
//    @GetMapping //agregar un nuevo registro a la bd
//    public PagedModel<EntityModel<DatosListaMedico>> listar(@PageableDefault(size = 10, sort = {"nombre"}) Pageable paginacion){     //nuestro repository que nos devuelve una lista de los medicos que hay en nuestra bd, convertimos esa lista de medicos en un stream para poder conseguir llamar un map,ese map convierte cada uno de los items a un DatosListaMedico que hicimos el constructor y luego reconvertimos esa lista en una lista propiamente dicha
//        Page<DatosListaMedico> pagina = repository.findAll(paginacion).map(DatosListaMedico::new);
//        // Usamos el pagedResourcesAssembler y el datosListaMedicoModelAssembler para convertir la Page en un PagedModel.
//        // Esto garantiza que cada objeto DatosListaMedico sea envuelto en un EntityModel, proporcionando una estructura JSON estable y permitiendo añadir links adicionales.
//        return pagedResourcesAssembler.toModel(pagina, datosListaMedicoModelAssembler);
//
//    }
//}
