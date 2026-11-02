package gg.corz;

import net.minecraft.class_2338;

public record IiiiIlliiiIl(long pos, String dimension, IliliIllliliIl type) {
   private final String llIIIiililIIIiil;
   private final IliliIllliliIl IiIIIiilliIIIiil;
   private final long iIIIIiilIlIIIiil;

   public long iIlIlllllill() {
      return this.iIIIIiilIlIIIiil;
   }

   public IiiiIlliiiIl(long pos, String dimension, IliliIllliliIl type) {
      this.iIIIIiilIlIIIiil = pos;
      this.llIIIiililIIIiil = dimension;
      this.IiIIIiilliIIIiil = type;
   }

   public class_2338 liiiIIllIl() {
      return class_2338.method_10092(this.iIIIIiilIlIIIiil);
   }

   public String IilliliilIIi() {
      return this.llIIIiililIIIiil;
   }

   public IliliIllliliIl lIiiIiIlilli() {
      return this.IiIIIiilliIIIiil;
   }

   public static IiiiIlliiiIl IliIlllilIi(class_2338 pos, String dimension, IliliIllliliIl type) {
      return new IiiiIlliiiIl(pos.method_10063(), dimension, type);
   }
}
