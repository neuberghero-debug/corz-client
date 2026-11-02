package gg.corz;

import net.minecraft.class_1299;

public record iIIIiilIlIIiil(int entityId, class_1299<?> type, double x, double y, double z, int data) implements IlIillIiilIi {
   private final int ililIiIliIiilIiIli;
   private final double IIIiIiIlilIIiIiIli;
   private final double llIiIiIliilIiIiIli;
   private final double iIIiIiIliIlIiIiIli;
   private final int IiIiIiIliliIiIiIli;
   private final class_1299<?> liilIiIliiiilIiIli;

   public int iliIiiliiiii() {
      return this.IiIiIiIliliIiIiIli;
   }

   public iIIIiilIlIIiil(int entityId, class_1299<?> type, double x, double y, double z, int data) {
      this.ililIiIliIiilIiIli = entityId;
      this.liilIiIliiiilIiIli = type;
      this.IIIiIiIlilIIiIiIli = x;
      this.iIIiIiIliIlIiIiIli = y;
      this.llIiIiIliilIiIiIli = z;
      this.IiIiIiIliliIiIiIli = data;
   }

   public int IliIlllilIi() {
      return this.ililIiIliIiilIiIli;
   }

   public double IilliliilIIi() {
      return this.iIIiIiIliIlIiIiIli;
   }

   public class_1299<?> liiiIIllIl() {
      return this.liilIiIliiiilIiIli;
   }

   public double iIlIlllllill() {
      return this.IIIiIiIlilIIiIiIli;
   }

   public double lIiiIiIlilli() {
      return this.llIiIiIliilIiIiIli;
   }
}
