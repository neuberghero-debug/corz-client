package gg.corz;

import java.nio.file.Path;

record IlIlIlIillIlIlIi(Path path, long modified, String name) {
   private final Path iiiiiiiiil;
   private final String lIIIIIIIIi;
   private final long IIIIIIIIIi;

   private IlIlIlIillIlIlIi(Path path, long modified, String name) {
      this.iiiiiiiiil = path;
      this.IIIIIIIIIi = modified;
      this.lIIIIIIIIi = name;
   }

   public Path IliIlllilIi() {
      return this.iiiiiiiiil;
   }

   public long liiiIIllIl() {
      return this.IIIIIIIIIi;
   }

   public String iIlIlllllill() {
      return this.lIIIIIIIIi;
   }
}
