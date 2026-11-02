package gg.corz;

import java.util.List;
import java.util.Locale;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_465;

public class IiiilIIiliiilIIi extends ilIllIiIll {
   private final lliliIIiililiIIi IilIiIiiil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","WeIsZ9h8URcGhJzZEHLcJYXGElERRX6mpIMB/DTw6ho=">(),
      IliIlllilIi<"IliIlllilIi","73hL+rde+bULsoxIt1sGbJ+zXWpAf86LJ/D1U0w4ZAqusiQvMa3soRkqOzORHRZr+16KZkXAdLFLOZholYbVeEzOAYJhZ5dpMQ1eT/eHnDFn">(),
      IliIlllilIi<"IliIlllilIi","1E8oeJggzbx1pz0mlegXXcFSXrzfSJMDBbQnRwnKfIW9OUJYAw==">(),
      IliIlllilIi<"IliIlllilIi","1E8oeJggzbx1pz0mlegXXcFSXrzfSJMDBbQnRwnKfIW9OUJYAw==">(),
      IliIlllilIi<"IliIlllilIi","rHFp9MeHxSfQzPpq+YPy/tp2+UKTjVJKuMXh4WjI3JapoRvDLQ==">()
   );
   private final IIIlIlIllIIlIlIl lilIiIiiil = new IIIlIlIllIIlIlIl(
      IliIlllilIi<"IliIlllilIi","C/ZQJ/ZJ2AeIDPSiUe5slVvcC6CfKxN9uINlB+UZOWWC">(),
      IliIlllilIi<"IliIlllilIi","mta4z9WYpEWLS5ddP+rbcKvy0+okX9hbI97wbp95L2zJldfzV0kKhfc4">(),
      List.of(class_1802.field_17498)
   );
   private int lliIiIiiil;
   private boolean liiIiIiiil;
   private int iliIiIiiil;
   private static final int IliIiIiiil = 20;
   private final iilliIlIIiliIl iilIiIiiil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","66+jPWu3oOPDqkQy6N5CCIXxAG2Lo1gm89sHnt7/tYgI">(),
      IliIlllilIi<"IliIlllilIi","WT87dmG1XShO7r9l5i+NLNvnPINnKo2/Gyq1eEWxULFsz/NV9gONe+NmDDsv6eu8USwibHv0+b7puPJEYgNlxw==">(),
      1,
      0,
      20
   );
   private final iiIiiilIIliiil IIiIiIiiil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","R0QHwzPQb63KJyappZixRuvpBlrb7yFulOAex1i+sjtTcgah">(),
      IliIlllilIi<"IliIlllilIi","KOCKwJ2k+a6imXcpeO1sO9HI3yPM5PF7bqocDb5pMGuHNYiGiH9g6dXZZZ37xW5EIA09c477i1Fnjkq0np+Ba7OfYvr8mFbKxux5APs+2PL/8lQsdftsMF8b8uz2qNjAYymeR6lLbkpPGrR2TjVuQ0ZbGDaesw==">(),
      true
   );
   private final iiIiiilIIliiil iIiIiIiiil;
   private long IiiIiIiiil;
   private final iilliIlIIiliIl lIiIiIiiil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","lHalCiVPNm9wYlnWKukjO5rRLEdTm43AYBrFLraQo8JD0wp+JkZXoIMTqWcy">(),
      IliIlllilIi<"IliIlllilIi","nDIQSGJzSNTuls2VtkBhCGQuAyMnfPhqAkzivB/FBf3ocOxnCL06om7lzSbUXbdcE8JyyTk0x1fF/UiOdZrWpkZZxJHkWkp+uDzWGg8LgRc=">(),
      25,
      5,
      120
   );

   @Override
   public void Illillliilli() {
      this.lliIiIiiil = -794576752 ^ 61 ^ -794576711;
      this.iliIiIiiil = 0;
      this.IiiIiIiiil = System.currentTimeMillis();
   }

   private int ilIllIiIll(class_1703 handler, int containerSlots) {
      int var3 = -1;

      for (int var4 = 0; var4 < containerSlots; var4++) {
         class_1799 var5 = handler.method_7611(var4).method_7677();
         if (!var5.method_7960()) {
            String var6 = var5.method_7964().getString().toLowerCase(Locale.ROOT);
            if (var6.contains(IliIlllilIi<"IliIlllilIi","PAF0PC+RmBeYdO4ZBo/MGhEtURWFCYUd/UUf14aiOUw=">())) {
               return var4;
            }

            class_1792 var7 = var5.method_7909();
            if (var7 == class_1802.field_8581 || var7 == class_1802.field_8656) {
               var3 = var4;
            }
         }
      }

      return var3;
   }

   private boolean IIllllIlll(class_1703 handler) {
      return Iiiilllliiilll.field_1755 != null
            && Iiiilllliiilll.field_1755
               .method_25440()
               .getString()
               .toLowerCase(Locale.ROOT)
               .contains(IliIlllilIi<"IliIlllilIi","PAF0PC+RmBeYdO4ZBo/MGhEtURWFCYUd/UUf14aiOUw=">())
         ? true
         : this.ilIllIiIll(
               handler,
               Math.max(
                  0,
                  handler.field_7761.size()
                     - ((((33740760 >>> 29 | 33740760 << 3) + 73) * 101 << 1 | ((33740760 >>> 29 | 33740760 << 3) + 73) * 101 >>> 31) ^ -1309491906)
               )
            )
            >= 0;
   }

   private void lIIlliIIll() {
      if (this.IIiIiIiiil.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.IiiIiIiiil >= (long)this.lIiIiIiiil.Iilllilliill() * 1000L) {
            float var3 = this.liiIiIiiil ? 8.0F : -8.0F;
            this.liiIiIiiil = !this.liiIiIiiil;
            Iiiilllliiilll.field_1724.method_36456(Iiiilllliiilll.field_1724.method_36454() + var3);
            this.IiiIiIiiil = var1;
         }
      }
   }

   private void iiiIlIIIll(class_1703 handler) {
      int var2 = handler.field_7761.size();
      int var3 = Math.max(0, var2 - 36);
      int var4 = this.ilIllIiIll(handler, var3);
      if (this.liIlliiIll(handler, var3, var4)) {
         for (int var5 = var3; var5 < var2; var5++) {
            class_1799 var6 = handler.method_7611(var5).method_7677();
            if (!var6.method_7960() && this.iIlllIllll(var6.method_7909())) {
               Iiiilllliiilll.field_1761.method_2906(handler.field_7763, var5, 0, class_1713.field_7794, Iiiilllliiilll.field_1724);
               this.iliIiIiiil++;
               this.lliIiIiiil = this.iilIiIiiil.Iilllilliill();
               this.IlIllllIll();
               return;
            }
         }
      }

      if (var4 >= 0) {
         if (this.iliIiIiiil > 0) {
            Iiiilllliiilll.field_1761.method_2906(handler.field_7763, var4, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
            if (this.iIiIiIiiil.Iilllilliill()) {
               Iiiilllliiilll.field_1724
                  .method_7353(
                     class_2561.method_43470(
                        IliIlllilIi<"IliIlllilIi","ak4VOPUpeY2E/e0mhrssrKmQQTeI2p2rl4CaPO2nnCDonrEktmTCRLaOvQlnpYosJBE=">()
                           + this.iliIiIiiil
                           + IliIlllilIi<"IliIlllilIi","tpDFGzcTKSP9iT0Typgeycdvp/BCg04xK7jO9/Rpg2+oR+uyJGQ=">()
                     ),
                     false
                  );
            }

            this.iliIiIiiil = 0;
            this.lliIiIiiil = this.iilIiIiiil.Iilllilliill();
            this.IlIllllIll();
         }
      } else {
         if (!this.liIlliiIll(handler, var3, -1)) {
            Iiiilllliiilll.field_1724.method_7346();
            this.lliIiIiiil = 20;
         }
      }
   }

   @Override
   public void Iilililiiili() {
      this.iliIiIiiil = 0;
   }

   public IiiilIIiliiilIIi() {
      super(IliIlllilIi<"IliIlllilIi","GDp4Mc2GLg78BK2SVC2UVdg3EZjVnQ4u62gb2VIVphz3Ga1b">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.iIiIiIiiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","T9Ibjd8LT9TRKJerAnUJvC6u4Q8Pc/QdbyYRWOr8pOUW10qSug6YRF0=">(),
         IliIlllilIi<"IliIlllilIi","mFHl8vcKywZ0fgi0K+aRNwXIuM2Dh96JLRS2buYQAnIwaRSaHIvwCog/eDoBZpwMCEdDRvgWHHooM3Q4mJ1H">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IilIiIiiil, this.lilIiIiiil, this.iilIiIiiil, this.IIiIiIiiil, this.lIiIiIiiil, this.iIiIiIiiil});
   }

   private void IlIllllIll() {
      this.IiiIiIiiil = System.currentTimeMillis();
   }

   private boolean liIlliiIll(class_1703 containerSlots, int handler, int sellButton) {
      for (int var4 = 0; var4 < handler; var4++) {
         if (var4 != sellButton && containerSlots.method_7611(var4).method_7677().method_7960()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1755 == null || Iiiilllliiilll.field_1755 instanceof class_465) {
            this.lIIlliIIll();
            if (this.lliIiIiiil > 0) {
               this.lliIiIiiil--;
            } else {
               class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
               boolean var2 = var1 instanceof class_1707 && this.IIllllIlll(var1);
               if (var2) {
                  this.iiiIlIIIll(var1);
               } else if (!(var1 instanceof class_1707)) {
                  Iiiilllliiilll.field_1724.field_3944.method_45730(IliIlllilIi<"IliIlllilIi","PAF0PC+RmBeYdO4ZBo/MGhEtURWFCYUd/UUf14aiOUw=">());
                  this.lliIiIiiil = 20;
               }
            }
         }
      }
   }

   private boolean iIlllIllll(class_1792 item) {
      long var3 = -3164740452432965209L;
      var3 ^= ((long)this.IilIiIiiil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","1E8oeJggzbx1pz0mlegXXcFSXrzfSJMDBbQnRwnKfIW9OUJYAw==">()) << 32 ^ var3)
         & -1L << 32;
      return (int)(var3 >>> 32) != 0 ? this.lilIiIiiil.Iiilliiliiil(item) : !this.lilIiIiiil.Iiilliiliiil(item);
   }
}
