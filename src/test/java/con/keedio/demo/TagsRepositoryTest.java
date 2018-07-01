package con.keedio.demo;

import com.keedio.demo.domain.Tag;
import com.keedio.demo.service.TagsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TagsRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private TagsRepository tagsRepository;

  // write test cases here
  @Test
  public void should_store_a_subscribetag() {
    Tag tag = tagsRepository.save(new Tag("1234567890", "DEFAULT-CLIENT-ID", String.valueOf(new Timestamp(System.currentTimeMillis()))));

    assertThat(tag).hasFieldOrPropertyWithValue("deviceId", "1234567890");
    assertThat(tag).hasFieldOrPropertyWithValue("clientId", "DEFAULT-CLIENT-ID");
    assertThat(tag).hasNoNullFieldsOrProperties();
  }
}