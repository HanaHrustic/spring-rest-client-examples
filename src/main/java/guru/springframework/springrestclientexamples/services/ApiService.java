package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
