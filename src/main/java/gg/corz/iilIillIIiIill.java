package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public final class iilIillIIiIill {
   public Boolean illlIiIIiIillIiIIi;
   public class_2338 llIlIiIIiilIlIiIIi;
   public final class_2338 IliIIiIIilliIIiIIi;
   public Integer IlllIiIIillllIiIIi;
   public lllillillill liIiIiIIiiiIiIiIIi;
   public final List<class_2350> lIIiIiIIiiIIiIiIIi;
   public class_2350 IiIlIiIIiliIlIiIIi;
   public class_2680 IiilIiIIiliilIiIIi;
   public class_2338 iIIlIiIIiIlIlIiIIi;
   public int llilIiIIiililIiIIi;
   public final class_2680 iliIIiIIiIiiIIiIIi;
   public boolean lillIiIIiiillIiIIi;
   public boolean IIilIiIIilIilIiIIi;
   public IIiIllllIiIlll IIIlIiIIilIIlIiIIi = IIiIllllIiIlll.liiIlIiiliiiIlIiil;
   public Float iiIlIiIIiIIllIiIIi;
   public final List<class_2338> iIilIiIIiIlilIiIIi = new ArrayList<>();
   public final List<class_2338> iiilIiIIiIIIiIiIIi = new ArrayList<>();
   public boolean ilIiIiIIiIiIiIiIIi;
   public Float lIllIiIIiiIllIiIIi;
   public int IlIiIiIIillIiIiIIi;
   public final class_1792 liiIIiIIiiiiIIiIIi;

   public iilIillIIiIill liiiIIllIl(class_2338 p) {
      this.iIIlIiIIiIlIlIiIIi = p;
      return this;
   }

   public iilIillIIiIill iIlIlllllill(class_2338 pos, class_2350 face) {
      this.llIlIiIIiilIlIiIIi = pos;
      this.IiIlIiIIiliIlIiIIi = face;
      return this;
   }

   public iilIillIIiIill lIiiIiIlilli(Float p) {
      this.lIllIiIIiiIllIiIIi = p;
      return this;
   }

   public iilIillIIiIill IliIlllilIi(IIiIllllIiIlll k) {
      this.IIIlIiIIilIIlIiIIi = k;
      return this;
   }

   public iilIillIIiIill IlIlllIlilIl(boolean s) {
      this.lillIiIIiiillIiIIi = s;
      return this;
   }

   public iilIillIIiIill IIIllIIliIIl(Boolean s) {
      this.illlIiIIiIillIiIIi = s;
      return this;
   }

   public iilIillIIiIill(class_2338 wanted, class_2680 target, class_1792 requiredItem) {
      this.lIIiIiIIiiIIiIiIIi = new ArrayList<>();
      this.liIiIiIIiiiIiIiIIi = lllillillill.IIiiilIilIiiilIi;
      this.IliIIiIIilliIIiIIi = wanted;
      this.iliIIiIIiIiiIIiIIi = target;
      this.IiilIiIIiliilIiIIi = target;
      this.liiIIiIIiiiiIIiIIi = requiredItem;
   }

   public iilIillIIiIill Illlllllilll(int ticks) {
      this.IlIiIiIIillIiIiIIi = Math.max(0, ticks);
      return this;
   }

   public iilIillIIiIill IIillIiliIil(lllillillill f) {
      this.liIiIiIIiiiIiIiIIi = f;
      return this;
   }

   public iilIillIIiIill iliIiiliiiii(int r) {
      this.IlllIiIIillllIiIIi = Math.floorMod(r, 16);
      return this;
   }

   public iilIillIIiIill IIlllIlliIll(class_2350 face) {
      this.lIIiIiIIiiIIiIiIIi.add(face);
      return this;
   }

   @Override
   public String toString() {
      return Iiilliiliiil<"Iiilliiliiil","WAbtjh2O6LHJu6KMx1a987X54c2EqRPwrdSLaov+3r7j5v69xrIWTYLF">()
         + (
            this.IliIIiIIilliIIiIIi == null
               ? Iiilliiliiil<"Iiilliiliiil","Cj/BEQSkOZrELOc7wFlfzzZ+bL7z2tGXJh9e83A=">()
               : this.IliIIiIIilliIIiIIi.method_23854()
         )
         + Iiilliiliiil<"Iiilliiliiil","zxabc+7DAXV8Rx5TeWQmutSQpvzVJJBgebCeI/OE70y78rU=">()
         + (
            this.iliIIiIIiIiiIIiIIi == null
               ? Iiilliiliiil<"Iiilliiliiil","Cj/BEQSkOZrELOc7wFlfzzZ+bL7z2tGXJh9e83A=">()
               : this.iliIIiIIiIiiIIiIIi.method_26204()
         )
         + Iiilliiliiil<"Iiilliiliiil","6YjsOP2ntdYIMBfZ2JfVVXz5LdDN8U+WLBrcddTYXCCATw==">()
         + this.IIIlIiIIilIIlIiIIi
         + (this.IiIlIiIIiliIlIiIIi != null ? Iiilliiliiil<"Iiilliiliiil","ZLMQauY3rlB6tCO4SxFH59I+SnQNCQHdFsNio0OmHVg9W7A=">() + this.IiIlIiIIiliIlIiIIi : "")
         + (this.iiIlIiIIiIIllIiIIi != null ? Iiilliiliiil<"Iiilliiliiil","R0vyAs2W1CNO5Iva5Wacg8OWqF21L+9AgogdxHLPS+q2">() + this.iiIlIiIIiIIllIiIIi : "")
         + (
            this.IlllIiIIillllIiIIi != null
               ? Iiilliiliiil<"Iiilliiliiil","kIb3zSAt9QRjycHY1WBDojNDzhKfiMmW55tdOIiJs07GkE0pLng=">() + this.IlllIiIIillllIiIIi
               : ""
         )
         + (
            !this.lIIiIiIIiiIIiIiIIi.isEmpty()
               ? Iiilliiliiil<"Iiilliiliiil","+hN9+mQsdcyNYcVP6z5ag2BD2TKP5X/oOZqCdyKPeomJvEY=">() + this.lIIiIiIIiiIIiIiIIi
               : ""
         )
         + (this.illlIiIIiIillIiIIi != null ? Iiilliiliiil<"Iiilliiliiil","2tX8zJElKR1K+/3xPlvIohIIl8yUqSHqO6MZWfXxNDJbrRQ=">() + this.illlIiIIiIillIiIIi : "")
         + (this.lillIiIIiiillIiIIi ? Iiilliiliiil<"Iiilliiliiil","mGIGW6CLVw8vrNlqAPvZLWu4Ufw/g9NyDyD7zuCOMGeo5mpVRNRMeuS1mg==">() : "")
         + (this.IIilIiIIilIilIiIIi ? Iiilliiliiil<"Iiilliiliiil","w0EOXY/ae9rGRZh3B44gldXcFVQk76KLqtBqeI0pmrG5jQ==">() + this.iIilIiIIiIlilIiIIi : "")
         + (this.llilIiIIiililIiIIi > 0 ? Iiilliiliiil<"Iiilliiliiil","TAq9nl2m1ziVhuFh+NSRyOAz6vGMVyD+1iO81/BOBibUUYMjYwU=">() + this.llilIiIIiililIiIIi : "")
         + (
            this.liIiIiIIiiiIiIiIIi != lllillillill.IIiiilIilIiiilIi
               ? Iiilliiliiil<"Iiilliiliiil","cK1wvIaS8aqaSARLcsEF7XpQfmhLZNC5n2fpGqp7GFS9Ww==">() + this.liIiIiIIiiiIiIiIIi
               : ""
         )
         + Iiilliiliiil<"Iiilliiliiil","a5Pi4vkX+rmWfh7yy+2Mc6VTalV2z5dVujwExAQ=">();
   }

   public iilIillIIiIill IilliliilIIi(Float y) {
      this.iiIlIiIIiIIllIiIIi = y;
      return this;
   }

   public iilIillIIiIill IiIlliIliiIl(class_2338 p) {
      this.IIilIiIIilIilIiIIi = true;
      this.iIilIiIIiIlilIiIIi.add(p);
      return this;
   }

   public iilIillIIiIill Iilllilliill(boolean allowed) {
      this.ilIiIiIIiIiIiIiIIi = allowed;
      return this;
   }

   public boolean Ililllililil() {
      return this.liIiIiIIiiiIiIiIIi == lllillillill.IIiiilIilIiiilIi;
   }
}
