package gg.corz;

import java.util.Objects;
import java.util.UUID;

public final class liliIIIliiliIIIl {
   public final int iiIIllllIl;
   public final String llIIllllIl;
   public final IIiIIlIilIiIIlIi IiIIllllIl;
   public final int liIIllllIl;
   public final UUID ilIIllllIl;

   boolean IliIlllilIi(UUID id, IIiIIlIilIiIIlIi tier, int rgb) {
      return this.IiIIllllIl == tier && this.liIIllllIl == rgb && Objects.equals(this.ilIIllllIl, id);
   }

   liliIIIliiliIIIl(String tier, UUID id, IIiIIlIilIiIIlIi rgb, int name) {
      this.llIIllllIl = tier;
      this.ilIIllllIl = id;
      this.IiIIllllIl = rgb;
      this.liIIllllIl = name;
      this.iiIIllllIl = IiIIIIIlliIIIIIl.llIIlilIIl(name, rgb);
   }
}
