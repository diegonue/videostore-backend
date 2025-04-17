package com.videostore.modules.movie.service;

import com.videostore.modules.actor.model.Actor;
import com.videostore.modules.actor.repository.ActorRepository;
import com.videostore.modules.director.model.Director;
import com.videostore.modules.director.repository.DirectorRepository;
import com.videostore.modules.genre.model.Genre;
import com.videostore.modules.genre.repository.GenreRepository;
import com.videostore.modules.movie.dto.MovieDTO;
import com.videostore.modules.movie.mapper.MovieMapper;
import com.videostore.modules.movie.model.Movie;
import com.videostore.modules.movie.repository.MovieRepository;
import com.videostore.modules.movietype.model.MovieType;
import com.videostore.modules.movietype.repository.MovieTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;
    private final MovieTypeRepository movieTypeRepository;
    private final DirectorRepository directorRepository;
    private final ActorRepository actorRepository;

    @Override
    public MovieDTO save(MovieDTO dto) {
        Genre genre = genreRepository.findById(dto.getGenreId()).orElseThrow();
        MovieType movieType = movieTypeRepository.findById(dto.getMovieTypeId()).orElseThrow();

        Set<Director> directors = directorRepository.findAllById(dto.getDirectorIds()).stream().collect(Collectors.toSet());
        Set<Actor> actors = actorRepository.findAllById(dto.getActorIds()).stream().collect(Collectors.toSet());

        Movie movie = MovieMapper.toEntity(dto, genre, movieType, directors, actors);
        Movie saved = movieRepository.save(movie);
        return MovieMapper.toDTO(saved);

    }

    @Override
    public List<MovieDTO> findAll() {
        return movieRepository.findAll()
                .stream()
                .map(MovieMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MovieDTO findById(Integer id) {
        return movieRepository.findById(id)
                .map(MovieMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<MovieDTO> findByGenreId(Integer genreId) {
        return movieRepository.findByGenreId(genreId).stream()
                .map(MovieMapper::toDTO)
                .collect(Collectors.toList());
    }
}
