package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.UserCategory;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                                    //Metodo do Service para UserCategory.

@Service
public class UserCategoryService {

    @Autowired
    UserCategoryRepository userCategoryRepository;

    @Autowired
    public UserCategoryService(UserCategoryRepository userCategoryRepository){
        this.userCategoryRepository = userCategoryRepository;
    }

    public UserCategory save(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public List<UserCategory> findAll(){
        return userCategoryRepository.findAll();
    }

    public Optional<UserCategory> findById(Long id){
        return userCategoryRepository.findById(id);
    }

    public UserCategory update(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public void deleteUserCategory(Long id){
        userCategoryRepository.deleteById(id);
    }
}
