package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

public class iIllIiilIlllIiil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIiiillil;
   private int IlIiiillil;
   private static final int iiIiiillil = 10;
   private final iiIiiilIIliiil iIIiiillil;
   private static final int llIiiillil = 0;
   private final iiIiiilIIliiil iiiliillil;
   private int Illiiillil;
   private int iIliiillil;
   private final List<lilIIiliilIIil> llliiillil;
   private static final int liIiiillil = 2;
   private final IIIIlilllIIIlill liiliillil = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","uTZ7JghiApu4S3D6oMVbLsn/4BlM4iMt1vCIeH80GRwK">(),
      IliIlllilIi<"IliIlllilIi","zRTd5NBZ6HTto6N1Gfeu9EoUe621LZMLp4GuPLWG082hORcqHeLIOiBmKm0gJ8nVguMMzPZiaptJny/Tkryh6cy1paW7WHWpVZLtKMm7totOyhC3FxMB8LMp8lr7p8Rlx/wLeMbpGJFGSYLeA9VfLCHrmHF/iHFjIbA1FY/70tZc15P2UrM3+/GqKe4Xg1SkSTKKIM+hsfq0fuedzayckAOM0IUPsDt1l64y49sFos6g5//ELHpFSwFPwwaninGkTzI=">(),
      1.0,
      1.0,
      10.0,
      0.1
   );
   private int lIliiillil;
   private static final int IiIiiillil = 8;
   private static final int IIliiillil = 3;
   private static final int ilIiiillil = 8;
   private final iilliIlIIiliIl lIIiiillil;

   public void ilIllIiIll(class_2338 pos, class_2680 original) {
      if (this.IIIiiillil.Iilllilliill()) {
         this.IlIiiillil = this.Illiiillil + this.lIIiiillil.Iilllilliill();
      }

      if (this.iIIiiillil.Iilllilliill() && this.llliiillil.size() < (1309153789 - -111 + 19 ^ 1309154175)) {
         this.llliiillil.add(new lilIIiliilIIil(pos, original, this.Illiiillil));
      }
   }

   @Override
   protected void Illillliilli() {
      this.lIliiillil = 3;
      this.iIliiillil = 0;
      this.IlIiiillil = 0;
      this.llliiillil.clear();
   }

   public boolean IlIllllIll() {
      return this.IIIiiillil.Iilllilliill() || this.iIIiiillil.Iilllilliill();
   }

   private void liIlliiIll(AccessorClientPlayerInteractionManager im) {
      if (Iiiilllliiilll.field_1687 != null) {
         Iterator var2 = this.llliiillil.iterator();

         while (var2.hasNext()) {
            lilIIiliilIIil var3 = (lilIIiliilIIil)var2.next();
            class_2680 var4 = Iiiilllliiilll.field_1687.method_8320(var3.lIlIiilIiiIlIiilIi);
            int var5 = this.Illiiillil - var3.illIiilIiIilIiilIi;
            boolean var6 = var4.equals(var3.IllIiilIilllIiilIi) || !var4.method_26215() && var4.method_26204() == var3.IllIiilIilllIiilIi.method_26204();
            if (var6) {
               this.iIliiillil = 0;
               int var7 = this.lIliiillil;
               this.lIliiillil = Math.min(this.lIliiillil + 2, 8);
               var2.remove();
            } else if (var5 >= 10) {
               this.iIliiillil++;
               if (this.iIliiillil >= 8 && this.lIliiillil > 0) {
                  int var8 = this.lIliiillil--;
                  this.iIliiillil = 0;
               }

               var2.remove();
            }
         }
      }

      if (im.getBlockBreakingCooldown() > this.lIliiillil) {
         im.setBlockBreakingCooldown(this.lIliiillil);
      }
   }

   public iIllIiilIlllIiil() {
      super(IliIlllilIi<"IliIlllilIi","jrThQG28eI5kS4cT2eWWMQA8YoCmYDoJDi6Bgg+TSkMwlztpUA==">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iiiliillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ocGVjoYKTg9G/9C3dLMFG40rDEHhtUZVn/wpwH/lXipdoKf4d6KKBLWs">(),
         IliIlllilIi<"IliIlllilIi","ZS77Cxru1SFY/pk1LJgmvFDcEvOR0r4i9voY+S/ONCCC0N72Le5NkaOON7szQUIAOn2hUC+U5owNGPnZvoDHVrBXEZEnCFQftpN+pDUI4vsPb9QZLNQ/d5qFyjwKRALX+yyUrZgeIX2ymYU+asCAxr1R/hjuHT5umKKnuNl1z/LGvB4=">(),
         true
      );
      this.IIIiiillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","P2xuWVog/5MWPhQH9GwoeTGGkoMwF8TTRioS1YsPOmkcWQ2Fj5O5">(),
         IliIlllilIi<"IliIlllilIi","csVvmfYHaP9o5ZC7KMV/pj0IMQ3h7qTlUlKrCQwRBrFhzKkVexQgk5XrNQqg2xoR830rmU1+g408pSvQGbsMmk/9iaQJEkW8YkqNbabKB41hp4t718Mu6bGpoqpw0qsfFrvRlP4Am8rHhnQFo3NbL+vpi8vaL/W9riBlalqnULVmy4FyeVVBdRVcEKKOvQTBxpPSBon8m1IshaS+3FjvBK3MPUi5wj4jOItRWRYCVmyQlc7sul+QDYSfMk2imHKTvEMvVMm/cA1Xgd9F+VgP7No1A0kK3ZYgvUo1TP5gJCsX0QEk9DQGXLHxfcVfMxrUQ6MRgG5gl3LTDZbduUzVnyPGWdghFAl3X1DYXDrqMkqg3QYr9pCPTt15tujUMvc/aEmzJ5PZ58hdg/A4W2fJbfD06Fzuz8HL7A==">(),
         false
      );
      this.lIIiiillil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","7C2WNnf4jB0rtWO5VsQf0tiTjfiAuIdu+IXXc9/R521cGJVyMeTVK6pCgZI=">(),
         IliIlllilIi<"IliIlllilIi","KKQHZxcmiyA6ndunGjYhZjAu5K3Z5Hz9kro7Sjc3Mvdr8UA5RzZ15X252SP+55kXh+KxqOSz/QZKYB/le5mM4FxP1sfxjxePWKF9TNRhHAReGeM7Dr5hS09naYqUG77W0fQP++q8qxrjBhofAO2OG9zizDUfKg==">(),
         1,
         1,
         20
      );
      this.iIIiiillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","JNWLd2oa6DhOeuzp30dFHkJlBE8UfXmhoFnjwreNld2+Wn2a5A==">(),
         IliIlllilIi<"IliIlllilIi","I2Z1/0XrajNuTuCydhQP6R7b89CpUj+oe+3CMbxe+GeVjXPom/ybXhQ4zow+LFMghl7o6k+h2RPvm+dw4Ddh9tkFTnMUaeYg8UVebd/NaSdgzrk7XqKuwBt35AIWrpGKW/elLnOkNDG46O2FFeTRK8jkMXwKXV60/3iEsqU8gqEFAjafApQ6CIT/WZTsoq5IboEE4mECSzokSjZBoDABKtAsXwNZo5IzJifwgUIlrbCRN2jk0VaSGnllzxoVNKbHQH++RyvZ5+06cFAZI+a1eMYg/Hks4Q==">(),
         false
      );
      this.IlIiiillil = 0;
      this.lIliiillil = 3;
      this.iIliiillil = 0;
      this.Illiiillil = 0;
      this.llliiillil = new ArrayList<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liiliillil, this.iiiliillil, this.IIIiiillil, this.lIIiiillil, this.iIIiiillil});
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1761 != null) {
         this.Illiiillil++;
         AccessorClientPlayerInteractionManager var1 = (AccessorClientPlayerInteractionManager)Iiiilllliiilll.field_1761;
         if (this.IIIiiillil.Iilllilliill()) {
            if (this.iiiliillil.Iilllilliill() && this.lIIlliIIll()) {
               var1.setBlockBreakingCooldown(0);
            }
         } else if (this.iIIiiillil.Iilllilliill()) {
            this.liIlliiIll(var1);
         } else if (this.iiiliillil.Iilllilliill()) {
            var1.setBlockBreakingCooldown(0);
         }
      }
   }

   public boolean lIIlliIIll() {
      return !this.IIIiiillil.Iilllilliill() || this.Illiiillil >= this.IlIiiillil;
   }

   @Override
   protected void Iilililiiili() {
      this.llliiillil.clear();
   }

   public float iiiIlIIIll() {
      return (float)this.liiliillil.Iilllilliill();
   }
}
