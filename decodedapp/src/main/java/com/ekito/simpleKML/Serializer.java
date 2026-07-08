package com.ekito.simpleKML;

import com.ekito.simpleKML.model.Coordinate;
import com.ekito.simpleKML.model.Coordinates;
import com.ekito.simpleKML.model.Kml;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/* JADX INFO: loaded from: classes.dex */
public class Serializer {
    org.simpleframework.xml.Serializer serializer = new Persister(new KMLMatcher());

    private class KMLMatcher implements Matcher {

        public class CoordinateTransformer implements Transform<Coordinate> {
            public CoordinateTransformer() {
            }

            @Override // org.simpleframework.xml.transform.Transform
            public Coordinate read(String str) throws Exception {
                return new Coordinate(str);
            }

            @Override // org.simpleframework.xml.transform.Transform
            public String write(Coordinate coordinate) throws Exception {
                return coordinate.toString();
            }
        }

        public class CoordinatesTransformer implements Transform<Coordinates> {
            public CoordinatesTransformer() {
            }

            @Override // org.simpleframework.xml.transform.Transform
            public Coordinates read(String str) throws Exception {
                return new Coordinates(str);
            }

            @Override // org.simpleframework.xml.transform.Transform
            public String write(Coordinates coordinates) throws Exception {
                return coordinates.toString();
            }
        }

        private KMLMatcher() {
        }

        @Override // org.simpleframework.xml.transform.Matcher
        public Transform<?> match(Class cls) throws Exception {
            if (cls.equals(Coordinate.class)) {
                return new CoordinateTransformer();
            }
            if (cls.equals(Coordinates.class)) {
                return new CoordinatesTransformer();
            }
            return null;
        }

        /* synthetic */ KMLMatcher(Serializer serializer, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public Kml read(File file) throws Exception {
        return (Kml) this.serializer.read(Kml.class, file, false);
    }

    public File write(Kml kml, File file) throws Exception {
        this.serializer.write(kml, file);
        return file;
    }

    public Kml read(InputNode inputNode) throws Exception {
        return (Kml) this.serializer.read(Kml.class, inputNode, false);
    }

    public OutputNode write(Kml kml, OutputNode outputNode) throws Exception {
        this.serializer.write(kml, outputNode);
        return outputNode;
    }

    public Kml read(InputStream inputStream) throws Exception {
        return (Kml) this.serializer.read(Kml.class, inputStream, false);
    }

    public OutputStream write(Kml kml, OutputStream outputStream) throws Exception {
        this.serializer.write(kml, outputStream);
        return outputStream;
    }

    public Kml read(Reader reader) throws Exception {
        return (Kml) this.serializer.read(Kml.class, reader, false);
    }

    public Writer write(Kml kml, Writer writer) throws Exception {
        this.serializer.write(kml, writer);
        return writer;
    }

    public Kml read(String str) throws Exception {
        return (Kml) this.serializer.read(Kml.class, str, false);
    }
}
