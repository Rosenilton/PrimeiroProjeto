package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;


import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.User;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                                        //Metodo do service para User.

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
