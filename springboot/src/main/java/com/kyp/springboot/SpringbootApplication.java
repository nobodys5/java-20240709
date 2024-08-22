package com.kyp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	void lombokExample() {
		Lombok lombok = new Lombok("a", "b", "c", false, false);

		lombok.getField1();
		lombok.setField3(null);

		lombok = new Lombok("d", "e");

		lombok.isField4();
		lombok.getField5();
	}
}

// GET - 데이터를 얻을 때 (RequestBody X)
// POST - 데이터를 작성할 때 (RequestBody O)
// PUT - 데이터를 전체 수정할 때 (RequestBody O)
// PATCH - 데이터를 일부 수정할 때 (RequestBody O)
// DELETE - 데이터를 삭제할 때 (RequestBody X)