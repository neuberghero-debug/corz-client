package gg.corz;

import net.minecraft.class_12125;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_9334;

public class liIIIliliiIIIlil extends ilIllIiIll {
   private final iiIiiilIIliiil IIlliilIil;
   private final iiIiiilIIliiil iiIliilIil;
   private int iIlliilIil;
   private int lIlliilIil;
   private final iilliIlIIiliIl liIliilIil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","fjvEZqXFXQ0vpHjGcSApW7eFwc/D/T5XZ0xMynKGeMjnXN8gNfU=">(),
      IliIlllilIi<"IliIlllilIi","WnSDpN7/AVv1ZLAy2jHABya08pMdiKZoGPlspXz85+2oreOYNYc/1unx+JZ1ZPS3rXTY/o8IrXeJX2nkvfObowWe">(),
      1,
      1,
      (-490709469 >>> 31 | -490709469 << 1) * -1056139499 ^ 2096190170
   );

   private void iiiIlIIIll() {
      class_1799 var1 = Iiiilllliiilll.field_1724.method_6047();
      class_12125 var2 = (class_12125)var1.method_58694(class_9334.field_63631);
      if (var2 != null) {
         Iiiilllliiilll.field_1761.method_75407(var2);
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }
   }

   @Override
   protected void Illillliilli() {
      this.lIlliilIil = 0;
      this.iIlliilIil = -1;
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1761 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (Iiiilllliiilll.field_1755 != null) {
            this.IIillIiliIil(false);
         } else {
            switch (this.lIlliilIil) {
               case 0:
                  int var1 = this.liIliilIil.Iilllilliill() - 1;
                  this.iIlliilIil = Iiiilllliiilll.field_1724.method_31548().method_67532();
                  if (this.iiIliilIil.Iilllilliill() && Iiiilllliiilll.field_1724.method_24828()) {
                     Iiiilllliiilll.field_1690.field_1903.method_23481(true);
                  }

                  if (this.iIlliilIil != var1) {
                     this.lIIlliIIll(var1);
                  }

                  this.iiiIlIIIll();
                  this.lIlliilIil = 1;
                  return;
               default:
                  Iiiilllliiilll.field_1690.field_1903.method_23481(false);
                  if (this.IIlliilIil.Iilllilliill() && this.iIlliilIil != -1) {
                     this.lIIlliIIll(this.iIlliilIil);
                  }

                  this.iIlliilIil = -1;
                  this.IIillIiliIil(false);
            }
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1690 != null) {
         Iiiilllliiilll.field_1690.field_1903.method_23481(false);
      }

      if (this.IIlliilIil.Iilllilliill()
         && this.iIlliilIil
            != ((((~1531787993 ^ -99) >>> 1 | (~1531787993 ^ -99) << 31) << 29 | ((~1531787993 ^ -99) >>> 1 | (~1531787993 ^ -99) << 31) >>> 3) ^ 1246440532)
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1724.field_3944 != null) {
         this.lIIlliIIll(this.iIlliilIil);
      }

      this.iIlliilIil = -1;
   }

   public liIIIliliiIIIlil() {
      super(IliIlllilIi<"IliIlllilIi","wWBXzsrZ9joE9+HDRpdtWKXOJ76lJJP5evqAGjhk97XrHo09Cc4=">(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.iiIliilIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","AiniAVe3phS6y5OMvg4f/njDT4L03GM+BCRUjm39VwA=">(),
         IliIlllilIi<"IliIlllilIi","W1bMyc5yK8pqY1JFaB5UDZ8pBKgV3t8uRzpz69UD6eIpX3DNmKa+LtFx6GljkfPunLcX">(),
         true
      );
      this.IIlliilIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Ags12q081fXW4NMt39Fj5xV2cQm4v54qR3CIx8eKrQkDcHzQHA==">(),
         IliIlllilIi<"IliIlllilIi","oKqxvPZTQwPcAc77AEKvTl3K4gZYX2rSzOGhZJypreL7pxiTTi5/fIwgwwEkjrjqdbFM3WkLXL4JXfQ8uYVq4LJNkhAMQXQ7//JhAI/XdIU7tqPLFgJbqGgcmTnX/d4Gqsh2GRp6mGZGg8gAJgYzOnqX4kcdgI5AsTb04MegulJZHS4OdLGh1JIrcIo=">(),
         true
      );
      this.iIlliilIil = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liIliilIil, this.iiIliilIil, this.IIlliilIil});
   }

   private void lIIlliIIll(int slot) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(slot);
   }
}
