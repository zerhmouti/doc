package com.doc.doc.service;

import com.doc.doc.dto.AbsenceDTO;
import com.doc.doc.model.Doctorant;
import com.doc.doc.model.Publication;
import com.doc.doc.repository.DoctorantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorantServiceImp implements DoctorantService{
    @Autowired
    private DoctorantRepo doctorantRepo;

    @Override
    public List<Doctorant> loadDoctorants() {
        return null;
    }

    @Override
    public List<Publication> loadPublications(int id) {
        return null;
    }

    @Override
    public List<AbsenceDTO> absence(int id) {
        int nombreAbsence;
        int nombreReunion ;
        //getAllReunion by year
        //iterate over all reunions and check if Doctorant is absent if so incrment nombreAbsence
        return null;
    }
}
