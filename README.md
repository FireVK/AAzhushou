#AAzhushou

aa����

##20150805

### 1. ��Բ��ֵ�ʱ��ע��bottom_box.xml��layout_alignParentBottom
### 2. ʵ��Acitity��Base�࣬�Ժ�������������������
### 3. ʵ��AcitivityFrame��

- Ҫ��Ҫ����requestWindowFeature(Window.FEATURE_NO_TITLE);
- ��̬������id(����ͼƬid)��item����layMainBody�е�

##20150806
### 1. ��main_body.xml����,������GridView
### 2. ��Ȼ����GridView���Ǿ�Ҫ��̬�ļ��������item����������Ҫbindһ��AdapterAppGrid,�½�AdapterAppGrid��
### 3. ��Ҫһ��װitem��layout
### 4. ��BaseAdapter�з�װһ��Holder��װiv��tv��ʵ����,��������ˬ
- ���õ�����Դ��װ��һ��Integer����m_ImageInteger��(��Դid)
- �����е�ivIcon��name���õ����ַ���Ҳ��װ��һ������m_ImageString��
- ע�⣺��װm_ImageString��ʱ�򣬷�װ�ڹ��캯�����Ϊ���string��ʱ����Ҫ�õ�������

### 5. ��дAdapterAppGrid����ķ���
˼·�����û��convertView�ʹ���һ��view��iv��tv�����о�ֱ�ӻ��<��items>��������Դ.
���Բο���http://www.cnblogs.com/andriod-html5/archive/2012/06/06/2539221.html
- �ص㸴дgetView(int position, View convertView, ViewGroup parent)����
- ��ô��ȡ(����)һ��layout����View? 
	- LayoutInflater _layoutInflater = LayoutInflater.from(mContext);
	- convertView = _layoutInflater .inflate(R.layout.main_body_item, null);
- convertView.setTag(Object)//��������һ��Tag������Է�Objectʵ�壬�����������ȡ���Object
### 6. ��ʼ����һЩ��װ
- initVariable()
- initView()
- initListeners()
- bindData()//���磺Adapter