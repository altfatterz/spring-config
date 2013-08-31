package com.za.spring.fun.repository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.za.spring.fun.config.RepositoryConfig;
import com.za.spring.fun.model.Item;
import com.za.spring.fun.model.PropertyDefinition;

/**
 * Integration test showing basic usage of {@link ItemRepository} using Java configuration.
 *
 * @author Zoltan Altfatter
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RepositoryConfig.class)
@Transactional
public class ItemRepositoryJavaConfigTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void javaConfig() {
        Item item = new Item();
        item.setName("page");
        item.addPropertyDefinition(new PropertyDefinition("title", "my blog"));
        item.addPropertyDefinition(new PropertyDefinition("footer", "social links"));

        assertThat(item.getId(), nullValue());
        item = itemRepository.save(item);
        assertThat(item.getId(), notNullValue());

        item = itemRepository.findOne(item.getId());

        assertThat(item.getName(), is("page"));
        assertThat(item.getPropertyDefinitions().get(0).getName(), is("title"));
        assertThat(item.getPropertyDefinitions().get(0).getValue(), is("my blog"));
        assertThat(item.getPropertyDefinitions().get(1).getName(), is("footer"));
        assertThat(item.getPropertyDefinitions().get(1).getValue(), is("social links"));
    }
}
