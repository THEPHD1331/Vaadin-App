//package com.springvaadin.view;
//
//import com.springvaadin.controller.DemoController;
//import com.springvaadin.entity.Graduate;
//import com.springvaadin.repository.GraduateRepository;
//import com.springvaadin.service.GraduateService;
//import com.vaadin.flow.component.grid.Grid;
//import com.vaadin.flow.component.grid.GridVariant;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.router.Route;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//@Route("graduates")
//public class GraduateView extends Div {
//
////    @Autowired
////    GraduateService graduateService;
//    @Autowired
//    DemoController controller;
//
//    public GraduateView(){
//
//        Grid<Graduate> grid = new Grid<>(Graduate.class, false);
//        grid.addColumn(Graduate::getId).setHeader("Id");
//        grid.addColumn(Graduate::getName).setHeader("Name");
//        grid.addColumn(Graduate::getField).setHeader("Field");
//        grid.addColumn(Graduate::getDegree).setHeader("Degree");
//        grid.addThemeVariants(GridVariant.MATERIAL_COLUMN_DIVIDERS);
//
//        List<Graduate> graduates = controller.getAll();
//        grid.setItems(graduates);
//        add(grid);
//    }
//}
