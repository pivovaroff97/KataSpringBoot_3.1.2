package ru.pivovarov.KataSpringBoot_312.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pivovarov.KataSpringBoot_312.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
}
