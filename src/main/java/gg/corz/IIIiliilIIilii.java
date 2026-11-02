package gg.corz;

import net.minecraft.class_2350.class_2351;

public final class IIIiliilIIilii {
   public final int lliiIliIIl;
   public final int liiiIliIIl;
   public final int iliiIliIIl;
   public final int IIIIlliIIl;
   public final int IiiiIliIIl;
   public final int iiiiIliIIl;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   int liiiIIllIl(class_2351 a) {
      return switch (a) {
         case field_11048 -> this.lliiIliIIl;
         case field_11052 -> this.iliiIliIIl;
         case field_11051 -> this.IiiiIliIIl;
         default -> throw new MatchException(null, null);
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   int iIlIlllllill(class_2351 a) {
      return switch (a) {
         case field_11048 -> this.liiiIliIIl;
         case field_11052 -> this.iiiiIliIIl;
         case field_11051 -> this.IIIIlliIIl;
         default -> throw new MatchException(null, null);
      };
   }

   public IIIiliilIIilii(int maxZ, int minX, int minZ, int maxY, int minY, int maxX) {
      this.lliiIliIIl = maxZ;
      this.iliiIliIIl = minX;
      this.IiiiIliIIl = minZ;
      this.liiiIliIIl = maxY;
      this.iiiiIliIIl = minY;
      this.IIIIlliIIl = maxX;
   }

   public boolean IliIlllilIi(int x, int z, int y) {
      return x >= this.lliiIliIIl && x <= this.liiiIliIIl && z >= this.iliiIliIIl && z <= this.iiiiIliIIl && y >= this.IiiiIliIIl && y <= this.IIIIlliIIl;
   }
}
