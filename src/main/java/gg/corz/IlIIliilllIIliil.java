package gg.corz;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1109;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2761;
import net.minecraft.class_3417;
import net.minecraft.class_6373;
import net.minecraft.class_638;
import net.minecraft.class_642;
import net.minecraft.class_8038;

public class IlIIliilllIIliil extends ilIllIiIll {
   private boolean lIillIilil;
   private final iiIiiilIIliiil IilllIilil;
   static final String IllllIilil = "Anticheat Back On";
   private final iiIiiilIIliiil lilllIilil;
   private final iiIiiilIIliiil illllIilil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","A+ZDfeOpEKnnpe1/yEa3oR3EO4cLer9salMCCRb1gPaeKq1Oj/UPm3M=">(),
      IliIlllilIi<"IliIlllilIi","Sw865a0ZqwIaOWayj+rnxZvU0WJIPeHz3gSVhXkI3hGL5/srSlRZ3JXYYR8Lg+mC2EQWWBfiKr3aWXVyfBcfcrPC0cTK+sthQw8=">(),
      true
   );
   static final String iIlllIilil = "Anticheat Off";
   private final lIlIlIiiIlIlIi iilllIilil;
   private final Map<String, llIIlillilIIlill> IIillIilil;
   static final String lllllIilil = "Anticheat On";

   public IlIIliilllIIliil() {
      super(IliIlllilIi<"IliIlllilIi","xUEble6+Z7nZKy4JKF8h28xaBhVasTAgwxCpzDmNF2R61bM=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IilllIilil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gg0Vhu3huKijBKa2kSAxCyGtHJnYbenmb0x2cxtMjeku">(),
         IliIlllilIi<"IliIlllilIi","+0cjO0Phx471GFziUUZJYQsgP8rVLcFxQGkl4pYPslT4obZC8dv3hCKQZK82asZxJGJNNVtefS7xEYtl+A==">(),
         true
      );
      this.lilllIilil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","+9A/3F6sghOLkH3HANLcIu7gPipvWKTNj/Q2pmPIIs3wmcHZ">(),
         IliIlllilIi<"IliIlllilIi","ftZXCA7JiQ6xBEuCrtU4+GzwpWqraDLgDkV8UOCZI2VFumDu9hMKAnO1ROtluNH553hSgarlTYN1lA==">(),
         false
      );
      this.iilllIilil = new lIlIlIiiIlIlIi();
      this.IIillIilil = new HashMap<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illllIilil, this.IilllIilil, this.lilllIilil});
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !Iiiilllliiilll.method_1542()) {
         liIIililiiIIilil var1 = this.iilllIilil.lIiiIiIlilli();
         if (var1 != liIIililiiIIilil.iiIliIIlil) {
            String var2 = this.lIIlliIIll();
            llIIlillilIIlill var3 = this.IIillIilil.put(var2, this.iilllIilil.IilliliilIIi());
            boolean var4 = this.lIillIilil;
            this.lIillIilil = false;
            if (var1 == liIIililiiIIilil.lIlliIIlil) {
               if (var3 != llIIlillilIIlill.ilIIiilill) {
                  this.IlIllllIll(
                     true, IliIlllilIi<"IliIlllilIi","iLJdnf5jMOfF2y+qd9F/dW8i4zdaf+HotoIz4OaaemYcgVWLWg6U8J8=">(), var2, iiIIlllIIlIlll.IliIlllilIi()
                  );
               }
            } else if (var3 == llIIlillilIIlill.ilIIiilill) {
               if (this.illllIilil.Iilllilliill()) {
                  this.IlIllllIll(
                     false, IliIlllilIi<"IliIlllilIi","YfbdAml40K3zqorbD6HVvs5DOO4D6JJCn+wlaVHETFn5mIc/gEwGynssuyED">(), var2, iiIIlllIIlIlll.liiiIIllIl()
                  );
               }
            } else if (var4) {
               this.IlIllllIll(
                  false, IliIlllilIi<"IliIlllilIi","Sz2LZUpCfXC8UC5cNhhy9jckRmFni53ZIHppEbQZfiDjbcTxogcRrQ==">(), var2, iiIIlllIIlIlll.iIlIlllllill()
               );
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.iilllIilil.iIlIlllllill();
      this.IIillIilil.clear();
      this.lIillIilil = true;
   }

   @Override
   protected void Iilililiiili() {
      iiillilIIIilil.iIlIlllllill();
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      if (event.iilIIiiIll instanceof class_8038 var2) {
         for (class_2596 var4 : var2.method_48324()) {
            this.iiiIlIIIll(var4);
         }
      } else {
         this.iiiIlIIIll(event.iilIIiiIll);
      }
   }

   private String lIIlliIIll() {
      long var6 = 1664148467597082260L;
      class_638 var1 = Iiiilllliiilll.field_1687;
      var6 ^= ((long)lllIIIIiillIIIIi.iIlllIllll() << 32 ^ var6) & -1L << 32;
      String var3 = class_1937.field_25180.equals(var1.method_27983())
         ? IliIlllilIi<"IliIlllilIi","+42ydphBgL1T4RMLzau0vIEk8luWiXBcI/LFeKwQCM0J4Q==">()
         : (class_1937.field_25181.equals(var1.method_27983()) ? IliIlllilIi<"IliIlllilIi","ggaZfRKIcAkNZ2ZzCFC/1UOONuCK13wSTIOdZtEJGx1casY=">() : null);
      if ((int)(var6 >>> 32) != 0) {
         if (var3 != null) {
            return var3;
         } else {
            String var8 = IIllllllIlllll.IliIlllilIi(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321());
            return var8 == null ? IliIlllilIi<"IliIlllilIi","b1hcLE1LGB2LUv/YDkyjd2fMTj/GgDi3zqz6ZkmpoUnT2i7w">() : var8;
         }
      } else {
         class_642 var4 = Iiiilllliiilll.method_1558();
         String var5 = var4 == null
            ? IliIlllilIi<"IliIlllilIi","ue0lU4ArciN1vf/IkT6A/g+62karqIRW8uOPchYidYLKTCtewTSt">()
            : (var4.field_3761 != null && !var4.field_3761.isBlank() ? var4.field_3761.trim() : var4.field_3752);
         return var3 == null ? var5 : var5 + IliIlllilIi<"IliIlllilIi","NQ3zbu3kHHiyEOKBprgd/XMsSDMRh7hfpeatiWU=">() + var3;
      }
   }

   private void IlIllllIll(boolean line, String title, String place, String off) {
      iiillilIIIilil.IliIlllilIi(new iIiiIlllIliiIlll(title, place, off, line));
      if (this.IilllIilil.Iilllilliill()) {
         Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3417.field_14561, line ? 1.15F : 0.8F, 1.0F));
      }

      if (this.lilllIilil.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(
                  (
                        line
                           ? IliIlllilIi<"IliIlllilIi","dvkNHTS0pwAdX7xQ589rn6/U5nSJKuWV8pDpUlqQOA==">()
                           : IliIlllilIi<"IliIlllilIi","gJ16saEdUXE3um/M+unk+9heWX8K50knelbJf15fxA==">()
                     )
                     + title
                     + IliIlllilIi<"IliIlllilIi","myd3daEDsl5cUZqe+q/zfdLUFoAFjZqYEHrL6RfkovI=">()
                     + place
                     + IliIlllilIi<"IliIlllilIi","706u47KpcCHzx5CW8If45RJdEYVRzGMKAPeIvc9b5vw=">()
                     + off
               ),
               false
            );
      }
   }

   private void iiiIlIIIll(class_2596<?> p) {
      if (p instanceof class_6373) {
         this.iilllIilil.IliIlllilIi();
      } else if (p instanceof class_2761) {
         this.iilllIilil.liiiIIllIl();
      } else if (p instanceof class_2678 || p instanceof class_2724) {
         this.iilllIilil.iIlIlllllill();
      }
   }
}
