package com.iterator;

import java.util.Iterator;

// definir comportamiento de colección

public class MyMarvelCollection<T> implements Iterable<T>
{

    private T[] movies;
    private int count = 0;

    public MyMarvelCollection(T[] filmVector)
    {
        this.movies = filmVector;
    }

    public void add(T film)
    {
        if(count<movies.length)
        {
            movies[count] = film;
            count++;
        }
    }

    @Override
    public Iterator<T> iterator()
    {
        return new Iterator<T>()
        {
            private int index = 0;

            @Override
            public boolean hasNext() 
            {
                return index < count;
            }

            @Override
            public T next() 
            {
                return movies[index++];
            }
        };
    }
}

