package gg.corz;

import java.util.List;

public record lliiliiiliilii(long cell, String kind, List<Long> schematicPrereqs, List<Long> tempPrereqs) {
   private final List<Long> iIIliliIIl;
   private final List<Long> IlIliliIIl;
   private final long IIIliliIIl;
   private final String lIIliliIIl;

   public long IliIlllilIi() {
      return this.IIIliliIIl;
   }

   public lliiliiiliilii(long cell, String kind, List<Long> schematicPrereqs, List<Long> tempPrereqs) {
      this.IIIliliIIl = cell;
      this.lIIliliIIl = kind;
      this.iIIliliIIl = schematicPrereqs;
      this.IlIliliIIl = tempPrereqs;
   }

   public String liiiIIllIl() {
      return this.lIIliliIIl;
   }

   public List<Long> IilliliilIIi() {
      return this.IlIliliIIl;
   }

   public List<Long> iIlIlllllill() {
      return this.iIIliliIIl;
   }
}
