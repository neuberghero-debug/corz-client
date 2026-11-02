package gg.corz;

import net.minecraft.class_1102;
import net.minecraft.class_1113;
import net.minecraft.class_3419;
import net.minecraft.class_1113.class_1114;

final class IliIIIilliIIIi extends class_1102 {
   boolean IiIIiIililiIIiIili;
   boolean llIIiIiliilIIiIili;
   final long liiilIiliiiiilIili;
   volatile boolean iIIIiIiliIlIIiIili;
   long iiIIiIiliIIlIiIili;
   final long iliilIiliIiiilIili;
   final IiIIlIiliIIlIi IliilIililliilIili;
   volatile long IIIIiIililIIIiIili;

   IliIIIilliIIIi(IiIIlIiliIIlIi track, long createdNs, long seekFrame) {
      super(track.IllliIIiilllliIIii, class_3419.field_61058, class_1113.method_43221());
      this.IliilIililliilIili = track;
      this.iliilIiliIiiilIili = createdNs;
      this.IIIIiIililIIIiIili = createdNs;
      this.liiilIiliiiiilIili = seekFrame;
      this.field_5446 = true;
      this.field_5451 = 0;
      this.field_5442 = 0.0F;
      this.field_5441 = 1.0F;
      this.field_18936 = true;
      this.field_5440 = class_1114.field_5478;
   }

   public boolean method_4785() {
      return true;
   }

   long IliIlllilIi() {
      return IllIlIIilllIlIIi.IlIlllIlilIl(this.IIIIiIililIIIiIili, this.iiIIiIiliIIlIiIili, this.IliilIililliilIili.illliIIiiIilliIIii);
   }

   public float method_4781() {
      return IllIlIIilllIlIIi.Illlllllilll();
   }
}
