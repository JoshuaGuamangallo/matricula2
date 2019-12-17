package unibe.edu.ec.matricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.matricula.dtos.AcademicRecordDto;
import unibe.edu.ec.matricula.repositories.AcademicRecordRepository;

@Controller
public class InscriptionController {
    @Autowired
    private AcademicRecordRepository academicRecordRepository;
    public void createInscription(AcademicRecordDto academicRecordDto) {

    }
}
