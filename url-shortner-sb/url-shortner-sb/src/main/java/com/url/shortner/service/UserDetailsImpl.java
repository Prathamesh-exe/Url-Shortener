package com.url.shortner.service;

import com.url.shortner.models.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
@NoArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID =1L;
    private Long id;
    private String username;
    private String password;
    private String email;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(String username, String password, String email, Collection<? extends GrantedAuthority> authorities, Long id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.authorities = authorities;
        this.id = id;
    }

    public static UserDetailsImpl build(User user){
        GrantedAuthority authority=new SimpleGrantedAuthority(user.getRole());
        return new UserDetailsImpl(
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                Collections.singletonList(authority),
                user.getId()
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
