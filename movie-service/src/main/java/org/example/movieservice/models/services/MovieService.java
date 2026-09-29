package org.example.movieservice.models.services;

import org.example.movieservice.exceptions.MovieNotFoundException;
import org.example.movieservice.models.entities.Movie;
import org.springframework.cache.annotation.Cacheable;

// áp dụng cache aside đubngs tên phương thức lấy phim theo id
// sử dụng cache có tên movies
// sử dụng id phim làm key cache
// Đồng bộ các request đồng thời cho 1 key
// không làm thay đổi logic truy vấn và xử lý logic MovieNotFoundException đã có

public interface MovieService {
    Movie getMovieById(Long id);

}
