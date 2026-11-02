package gg.corz;

import net.minecraft.class_2535;
import net.minecraft.class_2596;

public class IiIiIlIiliIiIlIi {
   public class_2596<?> lIiilIIIIi;
   private final class_2535 iIiilIIIIi;
   private boolean lliilIIIIi;
   private boolean IliilIIIIi;

   public class_2535 iIlIlllllill() {
      return this.iIiilIIIIi;
   }

   public IiIiIlIiliIiIlIi(class_2596<?> connection, class_2535 packet) {
      this.lIiilIIIIi = connection;
      this.iIiilIIIIi = packet;
      this.IliilIIIIi = false;
   }

   public void IliIlllilIi() {
      this.IliilIIIIi = true;
   }

   public boolean liiiIIllIl() {
      return this.IliilIIIIi || this.lliilIIIIi;
   }

   public boolean IilliliilIIi() {
      return this.lliilIIIIi;
   }

   public IiIiIlIiliIiIlIi(class_2596<?> packet) {
      this(packet, null);
   }

   public boolean lIiiIiIlilli() {
      return this.IliilIIIIi;
   }

   public void iliIiiliiiii() {
      this.lliilIIIIi = true;
   }
}
