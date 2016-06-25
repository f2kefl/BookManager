package ru.FL.bm.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.FL.bm.domain.Book;

/**
 * Created by F4KEFLY on 06.06.2016.
 * Description:
 * TODO:
 */
@Component
public class BookValidator implements Validator
{
    @Override
    public boolean supports(Class<?> clazz)
    {
        return Book.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors)
    {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Требуется имя");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "required.genre", "Требуется жанр");
    }
}
