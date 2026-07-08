package vh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public class y extends t {
    private final Long u0(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // vh.t, vh.k
    public j G(e0 e0Var) {
        rd.m.e(e0Var, "path");
        return t0(e0Var.n());
    }

    @Override // vh.t, vh.k
    public void e(e0 e0Var, e0 e0Var2) throws IOException {
        rd.m.e(e0Var, "source");
        rd.m.e(e0Var2, "target");
        try {
            Files.move(e0Var.n(), e0Var2.n(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    protected final j t0(Path path) {
        rd.m.e(path, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) u.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            e0 e0VarF = symbolicLink != null ? e0.a.f(e0.f30784b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lU0 = fileTimeCreationTime != null ? u0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lU02 = fileTimeLastModifiedTime != null ? u0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new j(zIsRegularFile, zIsDirectory, e0VarF, lValueOf, lU0, lU02, fileTimeLastAccessTime != null ? u0(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // vh.t
    public String toString() {
        return "NioSystemFileSystem";
    }
}
